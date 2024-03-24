class cpu{
double price;
cpu(double price) {
this.price = price;
}
public void printInfo() {
System.out.println("CPU price is: " + price);
}
class Processor {
int core;
String manufacture;
Processor(int core, String manufacture) {
this.core = core;
this.manufacture = manufacture;
}
public void printInfo() {
System.out.println("Cores are: " + core);
System.out.println("Manufacturer: " + manufacture);
}
}
public static class ram{
int memory;
String manufacture;
ram(int memory, String manufacture){
this.memory = memory;
this.manufacture = manufacture;
}
public void printInfo(){
System.out.println("RAM memory: " + memory);
System.out.println("RAM manufacture: " + manufacture);
}
}
public static void main(String[] args){
cpu cpu1 = new cpu(300);
cpu.Processor processor1 = cpu1.new Processor(4, "Intel");
cpu.ram ram1 = new cpu.ram(8, "Corsair");
cpu1.printInfo();
processor1.printInfo();
ram1.printInfo();
}
}
