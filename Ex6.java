/* 6) HashMap<String,Integer> h1={“abc”:50,”efg”:70};
if the mark is less than 60 then put the output in the
HashMap<String,String> h2={“abc”:”fail”,”efg”:”pass”}
*/




import java.util.*;
class Ex6
{
public static void main(String args[])
{
Ex6 project=new Ex6();
HashMap<String,Integer>h1=new HashMap<>();
h1.put("abc",50);
h1.put("efg",70);
project.result(h1);
}
public void result(HashMap<String,Integer>h1)
{
List<String>key=new ArrayList<>(h1.keySet());
	
List<Integer>value=new ArrayList<>(h1.values());
	
List<String >finalvalue=new ArrayList<>();
	
for(int i:value)
	
{
	    
if(i>60)
	    
finalvalue.add("pass");
	  
  else
	   
 finalvalue.add("fail");
	
}
	
HashMap<String,String>score=new HashMap<>();

	String a=key.toString();
	
String b=finalvalue.toString();

score.put(a,b);

System.out.println(score);
}
}

//output-{[abc, efg]=[fail, pass]}