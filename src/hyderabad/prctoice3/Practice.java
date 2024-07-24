package hyderabad.prctoice3;

import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;

public class Practice {

//	// Count each character-------method 1------------
//	public static void getCharCount(String name) {
//		name = name.replace(" ", "");
//		Map<Character, Integer> charValue = new HashMap<Character, Integer>();
//		char[] charArray = name.toCharArray();
//
//		// Advanced for loop
//		for (char c : charArray) {
//			if (charValue.containsKey(c)) {
//				charValue.put(c, charValue.get(c) + 1);
//			} else {
//				charValue.put(c, 1);
//			}
//		}
//		System.out.println(charValue);
//		
//		
//		// Count each character-------method 2------------
//		for(Map.Entry<Character, Integer> entry : charValue.entrySet()){
//			System.out.println(entry.getKey()+":"+entry.getValue());
//		}
//
//	}

	public static void main(String[] args) throws IOException, InterruptedException {
		// Palindrom---------------------------
//		String s = "madam";
//		String res = "";
//		for (int i = s.length() - 1; i >= 0; i--) {
//			res = res + s.charAt(i);
//		}
//		if (s.equals(res)) {
//			System.out.println("palindrom");
//		} else {
//			System.out.println("not");
//		}

		// reverse number----------------------
//		/*
//		 * Scanner sc = new Scanner(System.in);
//		 * int num=sc.nextInt();
//		 */
//		int num = 524354;
//		int rev=0;
//		
//		while(num!=0) {
//			rev=rev*10+num%10; //0+524354%10=0+4=4, 40+52435%10=40+5=45
//			num=num/10;  //52435, 5243
//		}
//		System.out.println(rev);

		// reverse character----------------------
//		String str = "Vedhika";
//		String rev = "";
//		for(int i=str.length()-1;i>=0;i--) {
//			rev = rev+str.charAt(i);
//		}
//			System.out.println(rev);

		// Reverse Array---------------------------
//		int[] arr = {4,542,6,5};
//		for(int i=arr.length-1;i>=0;i--) {
//			System.out.print(arr[i]);
//		}

		// Reverse words-----------1------------------
//		String str = "I like Vedhika";
//		String []word = str.split(" ");
//		for(int i=word.length-1;i>=0;i--) {
//		System.out.println(word[i]);
//		}		
		// Reverse words-----------2------------------
//		for(int i=word.length-1;i>=0;i--) {
//			System.out.print(word[i]+" ");
//		}

		// Advanced for loop will print all ascending
//		for(String a:word) {
//			System.out.print(a+" ");
//		}

		// Character Count------------------------
//		String str = "my name , is";
//		int count = 0;
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) != ' ' && str.charAt(i) != ',')
//				count++;
//
//		}
//		System.out.println("total char: " + count);

		// Count the words-----------------------
//		String str = "my name is is vedhika";
//		int count = 0;
//		String[] word = str.split(" ");
//		for (int i = 0; i < word.length; i++) {
//			count++;
//		}
//		System.out.println(count);

		// Count each character-------------------
//		getCharCount("my testing ism");

//		//Date count
		int month = 2;
//		//method 1
//		if (month == 1) {
//			System.out.println("31");
//		} else if (month == 11) {
//			System.out.println("30");
//		} else
//			System.out.println("enter valid");
//
//		//method 2
//		switch (month) {
//		case 2:
//			System.out.println("28/29");
//			break;
//		case 11:
//			System.out.println("30");
//			break;
//		}
//		//method 3
//		switch(month) {
//		case 1:
//		case 3:
//			System.out.println("31");
//			break;
//		case 2:
//			System.out.println("28/29");
//			break;

		// Count and print duplicate characters
//		String str = "meheshbabuu";
//		char[] duplicate = str.toCharArray();
//		int count = 0;
//		for (int i = 0; i <= str.length()-1; i++) {
//			for (int j = i + 1; j <= str.length()-1; j++) {
//				if (duplicate[i] == duplicate[j]) {
//					System.out.println(duplicate[j]);
//					count++;
//				}
//			}
//		}
//		System.out.println(count);

//		// find/count out vowels
//		String str = "welcome";
//		int count = 0;
//		for (int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//			if (ch == 'o' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u') {
//				System.err.println("vowels present"+ch);
//				count++;
//			}
//		}
//		System.out.println(count);

//		//Number pattern
////		12345
////		12345
////		12345
////		12345
////		12345
//		for(int i=1;i<=5;i++) {
//			for(int i1=1;i1<=5;i1++) {
//				System.out.print(i1);
//			}
//			System.out.println();
//		}
//		
////		   1
////		   23
////		  12345
////		 1234567
////		123456789
//		for(int i=1;i<=5;i++) {
//			for(int s=1;s<=5-i;s++) {
//				System.out.print(" ");
//			}
//			for(int j=1;j<=i*2-1;j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}

////		 	1
////		   12
////		  123
////		 1234
////		12345
//		for (int i = 1; i <= 5; i++) {
//			for (int s = 1; s <= 5 - i; s++) {
//				System.out.print(" ");
//			}
//			for (int j = 1; j <= i; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}

////		1    
////		12   
////		123  
////		1234 
////		12345
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(j);
//			}
//			for (int s = 1; s <= 5-i; s++) {
//				System.out.print(" ");
//			}
//			System.out.println();
//		}

		// Odd_even and positive_negetive
//		int num = -10;
//		
//		if(num%2==0) {
//			System.out.println("even");
//		}else
//			System.out.println("odd");
//		if(num<0) {
//			System.out.println("negetive");
//		}else if(num>0) {
//			System.out.println("positive");	
//		}else
//			System.out.println("zero");

		// Palindrom
//		String s = "madam";
//		String rev ="";
//		for(int i=s.length()-1;i>=0;i--) {
//			rev = rev + s.charAt(i);
//		}
//			if(s.equals(rev)) {
//				System.out.println("palindrom");
//			}else
//				System.out.println("not palindrom");

////			*
////		   ***
////		  *****
////		 *******
////		*********
//	//Star pattern
//		for(int i=1;i<=5;i++) {
//			for(int s=1;s<=5-i;s++) {
//				System.out.print(" ");
//			}
//			for(int j=1;j<=i*2-1;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

////		*********
////		 *******
////		  *****
////		   ***l
////		    *
//		for(int i=5;i>=1;i--) {
//			for(int s=1;s<=5-i;s++) {
//				System.out.print(" ");
//			}
//			for(int j=1;j<=i*2-1;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		*    
//		***   
//		*****  
//		******* 
//		*********
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=i*2-1;j++) {
//				System.out.print("*");
//			}
//			for(int s=1;s<=5-i;s++) {
//				System.out.print(" ");
//			}
//			System.out.println();
//		}

//		// ReadExcel
//		String excelPath = "C:\\Users\\srava\\eclipse-workspace\\com.hyderabad.practice\\Resources";
//		FileInputStream fis = new FileInputStream(excelPath);
//		XSSFWorkbook wb = new XSSFWorkbook(fis);
//		XSSFSheet sheet = wb.getSheet("data 1");
//		String data = sheet.getRow(1).getCell(1).getStringCellValue();
//		System.out.println(data);

//		//Handle alerts with cross browser twsting
//		//Accept and getText---------------------
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
//		Alert a = driver.switchTo().alert();
//		System.out.println(a.getText());
//		
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		a.accept();
//		//driver.close();
//
//		//accept and dismiss
//		WebDriver edge = new EdgeDriver();
//		edge.get("https://the-internet.herokuapp.com/javascript_alerts");
//		edge.manage().window().maximize();
//		edge.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
//		Alert a1 = edge.switchTo().alert();
//		System.out.println(a1.getText());
//		//edge.switchTo().alert().accept();//close alert by clicking Ok button
//		edge.switchTo().alert().dismiss();//close alert by clicking cancel button
//		//edge.quit();
//		
//		//handle alert by entering value 
//		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
//		System.out.println(a.getText());
//		//driver.switchTo().alert().sendKeys("Testing");
//		a.sendKeys("Testing");
//		driver.switchTo().alert().accept();
//		driver.quit();

//		char ch[] = {'j','a','i','k'};
//		System.out.println(String.valueOf(ch));

//		// find PrimeNumber or not 
//		int count = 0;
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//
//		for (int i = 1; i <= num; i++) {
//			if (num % i == 0) {
//				count++;
//			}
//		}//prime number only devided by 1 and itself (i.e.-2)
//		if (count == 2) {
//			System.out.println("prime");
//		} else {
//			System.out.println("not prime");
//		}

//		// prime numbers between two numbers
//		String str = new String("vedhika");
//		int n1 = 20;
//		int n2 = 50;
//		int i, j = 0;
//		int count = 0;
//		for (i = n1; i <= n2; i++) {
//			for (j = 2; j <= n2; j++) {
//				if (i % j == 0)
//					break;
//			}
//			if (i == j && i % 1 == 0) {
//				System.out.println(j);
//				count++;
//			}
//		}
//		System.out.println(count);
//
//		// find given number prime or not
//		int num = 17;
//		int count1 = 0;
//		for (int i1 = 1; i1 <= num; i1++) {
//			if (num % i1 == 0) {
//				count1++;
//			}
//		}
//		if (count1 == 2) {
//			System.out.println("prime");
//		} else {
//			System.out.println("not prime");
//		}

//		//Random number String printing
//		String otp = "";
//		for(int i=0;i<6;i++) {
//			otp=otp+(int)(Math.random()*10);
//			
//		}System.out.println(otp);
//		//------------//
//		Random random = new Random();
//		System.out.println((int)(random.nextDouble()*10));
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].value='dbbasd';",element);
	}

}
