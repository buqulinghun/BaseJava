package chapter11.chapter11_6;
import java.io.*;

public class InsertContent
{
	public static void insert(String fileName , long pos
		, String insertContent) throws IOException
	{
		File tmp = File.createTempFile("tmp" , "txt");
		tmp.deleteOnExit();
		try(
			RandomAccessFile raf = new RandomAccessFile(fileName , "rw");
			// ʹ����ʱ�ļ�����������������
			FileOutputStream tmpOut = new FileOutputStream(tmp);
			FileInputStream tmpIn = new FileInputStream(tmp))
		{
			raf.seek(pos);
			// (1) ������뽫����������ݶ�����ʱ�ļ��б���------
			byte[] bbuf = new byte[64];
			// ���ڱ���ʵ�ʶ�ȡ���ֽ���
			int hasRead = 0;
			// ʹ��ѭ����ʽ��ȡ�����������
			while ((hasRead = raf.read(bbuf)) > 0 )
			{
				// ����ȡ������д����ʱ�ļ�
				tmpOut.write(bbuf , 0 , hasRead);
			}
			// ----------��������������----------
			// ��2�����ļ���¼ָ�����¶�λ��posλ��
			raf.seek(pos);
			// ׷����Ҫ���������
			raf.write(insertContent.getBytes());
			// ��3��׷����ʱ�ļ��е�����
			while ((hasRead = tmpIn.read(bbuf)) > 0 )
			{
				raf.write(bbuf , 0 , hasRead);
			}
		}
	}
	public static void main(String[] args)
		throws IOException
	{
		insert("InsertContent.java" , 45 , "���������\r\n");
	}
}
