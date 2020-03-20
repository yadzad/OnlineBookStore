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
        // ��������������Ϳͻ�������
        try {
            InputStream inputStream = socket.getInputStream();
            // �õ�һ�������������տͻ��˴��ݵ���Ϣ
            InputStreamReader inputStreamReader = new InputStreamReader(
                    inputStream);// ���Ч�ʣ����Լ��ֽ���תΪ�ַ���
            BufferedReader bufferedReader = new BufferedReader(
                    inputStreamReader);// ���뻺����
            OutputStream outputStream = socket.getOutputStream();// ��ȡһ��������������˷�����Ϣ
            PrintWriter printWriter = new PrintWriter(outputStream);// ���������װ�ɴ�ӡ��
            String temp = null;
            String jsonrescive = "";
            String json = "";
            //String info = "";
            while ((temp = bufferedReader.readLine()) != null) {
            	jsonrescive += temp;
            }
            //��JSON�ַ�������ȡ��Ϣ������һ��JasonRecive,Ȼ��ִ��SQL����
            JasonRecive js1 = JSON.parseObject(jsonrescive, JasonRecive.class);
            JasonReturn jsrn = ExcuteSQL.Excute(js1);
         
            //��JasonReturn jsrn ת����json�ַ���
            json = JSON.toJSONString(jsrn);         		
            //��ͻ��˷���json�ַ�����
            printWriter.print(json);
            printWriter.flush();
            
            printWriter.close();
            outputStream.close();
            //socket.shutdownOutput();// �ر������
            // �ر����Ӧ����Դ
            bufferedReader.close();
            inputStream.close();
       
            SocketThread.sleep(10);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}

    }

}