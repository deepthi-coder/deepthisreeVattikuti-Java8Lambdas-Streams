import java.util.*;

interface PalindInterface{
static boolean isPalin(String s) {
int r=s.length()-1;
int l=0;
while(l<=r){
if(s.charAt(l)!=s.charAt(r))
return false;
l++;
r--;
}
return true;
}
}


class Palindrome implements PalindInterface{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println("enter no.of strings");
int n=sc.nextInt();

ArrayList<String> a=new ArrayList<String>();

for(int i=0;i<n;i++)
a.add(sc.next());

System.out.println("palindromes are:");
for(int i=0;i<n;i++){
if(PalindInterface.isPalin(a.get(i)))
System.out.println(a.get(i));
}
  }


}

