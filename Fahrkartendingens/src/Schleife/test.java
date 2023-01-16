package Schleife;

public class test {
public static void main(String[] args) {
int x=5, y=11;
if(x<y/2) {
	y=x;
	x=y;
}
System.out.println(""+x+y);
}
}

