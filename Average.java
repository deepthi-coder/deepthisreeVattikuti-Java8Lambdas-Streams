import java.util.*;
import java.util.stream.*;
class Average{

static int sum(ArrayList<Integer> a){

return a.stream().mapToInt(i->i).sum();
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter number of elements");
int n=sc.nextInt();
ArrayList<Integer> a=new ArrayList<Integer>();

for(int i=0;i<n;i++)
a.add(sc.nextInt());


System.out.print("Average of elements is "+(double)sum(a)/n);
}
}