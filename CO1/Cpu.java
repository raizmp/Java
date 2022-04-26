class Cpu
{
	int price;
	Cpu(int p)
	{
		this.price=p;
	}
	class Processor
	{
		int cores;
		String manufacture;
		Processor(int n,String m)
		{
			this.cores=n;
			this.manufacture=m;
		}
		void display()
		{
			System.out.println("no of cores:"+this.cores);
			System.out.println("processor manufacture:"+this.manufacture);
		}
	}
static class Ram
{
	int memory;
	String manufacture;
	Ram(int n,String m)
	{
		this.memory=n;
		this.manufacture=m;
	}
	void display()
	{
		System.out.println("memory size:"+this.memory);
		System.out.println("memory manufacture:"+this.manufacture);
	}
}
void display()
{
	System.out.println("price of CPU:"+this.price);
}
public static void main(String args[])
{
	Cpu intel=new Cpu(23000);
	Cpu.Processor i_processor=intel.new Processor(4,"intel");
	Cpu.Ram i_ram=new Ram(1024,"Asus");
	intel.display();
	i_processor.display();
	i_ram.display();
}
}	





























			
