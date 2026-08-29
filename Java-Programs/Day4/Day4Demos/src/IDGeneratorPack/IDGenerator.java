package IDGeneratorPack;

public class IDGenerator
{
	static int id;
	static
	{
		id=0;
	}
	static public int getID()
	{
		return ++id;
	}
}