import java.util.*;
class Lower{

static void getstr(ArrayList<String> a){
a.forEach(n->{if(n.length()==3 && n.charAt(0)=='a')System.out.println(n);});


}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter no.of strings");
int n=sc.nextInt();
ArrayList<String> a=new ArrayList<String>();

for(int i=0;i<n;i++)
a.add(sc.next());
System.out.println("strings with length 3 and start with a are:");
getstr(a);
}
}