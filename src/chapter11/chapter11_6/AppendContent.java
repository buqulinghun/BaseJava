package chapter11.chapter11_6;
import java.io.*;

public class AppendContent
{
	public static void main(String[] args)
	{
		try(
			//�Զ���д��ʽ��һ��RandomAccessFile����
			RandomAccessFile raf = new RandomAccessFile("out.txt" , "rw"))
		{
			//����¼ָ���ƶ���out.txt�ļ������
			raf.seek(raf.length());
			raf.write("׷�ӵ����ݣ�\r\n".getBytes());
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}
