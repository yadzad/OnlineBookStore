package buyerSide;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

import com.alibaba.fastjson.JSON;


public class SocketThread extends Thread {
    private Socket socket;
    private boolean over = false;
    public SocketThread(Socket socket) {
        this.socket = socket;
    }
    @SuppressWarnings("finally")
	public boolean get_over()
    {
    	try
    	{
    		return over;
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	finally
    	{
    		return over;
    	}
    }
    public void run() {
        // 根据输入输出流和客户端连接
        try {
            InputStream inputStream = socket.getInputStream();
            // 得到一个输入流，接收客户端传递的信息
            InputStreamReader inputStreamReader = new InputStreamReader(
                    inputStream);// 提高效率，将自己字节流转为字符流
            BufferedReader bufferedReader = new BufferedReader(
                    inputStreamReader);// 加入缓冲区
            OutputStream outputStream = socket.getOutputStream();// 获取一个输出流，向服务端发送信息
            PrintWriter printWriter = new PrintWriter(outputStream);// 将输出流包装成打印流
            String temp = null;
            String jsonrescive = "";
            String json = "";
            //String info = "";
            while ((temp = bufferedReader.readLine()) != null) {
            	jsonrescive += temp;
            }
            //从JSON字符串中提取信息，生成一个JasonRecive,然后执行SQL操作
            JasonRecive js1 = JSON.parseObject(jsonrescive, JasonRecive.class);
            JasonReturn jsrn = ExcuteSQL.Excute(js1);
         
            //将JasonReturn jsrn 转换成json字符串
            json = JSON.toJSONString(jsrn);         		
            //向客户端发送json字符串。
            printWriter.print(json);
            printWriter.flush();
            
            printWriter.close();
            outputStream.close();
            //socket.shutdownOutput();// 关闭输出流
            // 关闭相对应的资源
            bufferedReader.close();
            inputStream.close();
       
            SocketThread.sleep(10);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

    }

}