package PartC;

public interface Boardable 
{
	public void setBoardStart(int year, int month, int day);
	public void setBoardEnd(int year, int month, int day);
	public boolean boarding(int year, int month, int day);	
}
