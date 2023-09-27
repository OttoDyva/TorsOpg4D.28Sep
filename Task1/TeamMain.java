public class TeamMain
{

	public static void main (String[] args)
	{
		Team t = new Team("WarDogs");
		t.setRank(1);
		System.out.println(t);

		Team a = new Team("Taberne");
		a.setRank(102);
		System.out.println(a);

		Team b = new Team("FuckMig");
		b.setRank(7);
		System.out.println(b);

		Team c = new Team("Tømmerbobs");
		c.setRank(3);
		System.out.println(c);

		Team d = new Team("HalvHjernerne");
		d.setRank(1062);
		System.out.println(d);
	}
}