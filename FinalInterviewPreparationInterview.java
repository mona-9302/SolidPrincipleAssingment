class StrReverse{

	public static String revString(String s){

		for(int i=s.length()-1;i>=0;i--){
			System.out.println(s.charAt(i));
		}
		return s;
	}

	public static void main(String[] args) {
		
       String s = "monika";
       revString(s);
	}
}

class checkPallindrome{
    
    public static String checkPall(String s){
    	 char ch[] = s.toCharArray();

    	 boolean temp  = true;
    	 int start=0,last=ch.length-1;
    	 for(int i=0;i<ch.length;i++){
    	 	 if(ch[start]!=ch[last]){
    	 	 	 temp = false;
    	 	 	 break;
    	 	 }
    	 }
    	 if(temp){
    	 	System.out.println("is pallindrome");
    	 }
    	 else {
    	 	System.out.println("not pallindrome");
    	 }
    	 return s;
    }
	public static void main(String[] args) {
		
		  String s = "eyey";
		  checkPall(s);

	}
}

class CountFrquency{
	public static void main(String[] args) {
		
       String s = "aabbcccdddeee";
       char ch[] = s.toCharArray();

       for(int i=0;i<ch.length;i++){
       	 int count = 1;

       	 if(ch[i]=='0')
       	 	continue;

       	 for(int j=i+1;j<ch.length;j++){
       	 	 if(ch[i]==ch[j]){
       	 	 	count++;
       	 	 	ch[j] = '0';
       	 	 }
       	 }
       	 System.out.println(ch[i]+"=====>"+count);
       }
	}
}

class PrintActualChar{

	public static void main(String[] args) {
		
		 String s = "aabbcccsssddeepp";
		 char  ch[] = s.toCharArray();

		 for(int i=0;i<ch.length;i++){

		 	if(ch[i]=='0')
		 		continue;

		 	for(int j=i+1;j<ch.length;j++){
		 		if(ch[i]==ch[j]){
		 			ch[j] = '0';
		 		}
		 	}
		 	System.out.println("print char "+  ch[i]);
		 }

	}
}

class RemoveDuplicate{

	public static void main(String[] args) {
		
		 String s = "aabbcccdddeee";
		 char ch[] = s.toCharArray();
		 
		 for(int i=0;i<ch.length;i++){
		 	 int count = 1;
          
            if(ch[i]=='0')
            	continue;

		 	 for(int j=i+1;j<ch.length;j++){
		 	 	 if(ch[i]==ch[j]){
		 	 	 	 count++;
		 	 	 	 ch[j] = '0';
		 	 	 }
		 	 }
		 	 if(count>1){
		 	 	System.out.println(ch[i]);
		 	 }
		 }
	}
}

class PrintFirstNon{

	public static void main(String[] args) {
		
		 String s = "monikamdaaoikadh";
		 char ch[] = s.toCharArray();

		 for(int i=0;i<ch.length;i++){
		 	 int count = 0;
          
             if(ch[i]=='0')
             	continue;
             
		 	 for(int j=0;j<ch.length;j++){
		 	 	 if(ch[i]==ch[j]){
		 	 	 	count++;
		 	 	 	ch[j] = '0';
		 	 	 }
		 	 }
		 	 if(count==1){
		 	 	System.out.println(ch[i]);
		 	 	return;
		 	 }
		 }
	}
}

class ExampleEncapssulation{

    private String name;


	public static void main(String[] args) {
		
	}
}

abstract class PaymentService{

	abstract void payment(int payment);
}

class CreditCard extends PaymentService{

     void payment(int pay){
     	System.out.println("amount is paying =====>" + pay);
     }
	public static void main(String[] args) {
		
		 PaymentService pay = new CreditCard();
		 pay.payment(100);
	}
}