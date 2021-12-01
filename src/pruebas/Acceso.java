package pruebas;

public class Acceso{
	public int num;
	private int rs;
	
	public int acceso (int num1)
	{
		num =24;
		rs =num + num1;
		sop(" "+num);
		sop(" + ");
		sop(" "+num1);
		sop("---");
	    sop(" "+rs);
	        return rs;
    }

	    private void sop(String s)
    {
	        System.out.println(s);
    }
}
	
