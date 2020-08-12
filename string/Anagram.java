package string;

public class Anagram {

	public static void main(String[] args) {
		String name = "silent";
		String name2 = "listen";
		String[] newName = name.split("");
		String[] newName2 = name2.split("");
		for(int i=0;i<newName.length;i++) {
			int minInd=i;
			for(int j=i;j<newName2.length;j++) {
				if(newName[i]==newName2[j]) {
					minInd=j;
				}
			}
			String temp=newName2[i];
			newName2[i]=newName2[minInd];
			newName2[minInd]=temp;
			for(String item : newName2) {
				System.out.print(item);
			}
			
		}
//		for(String item : newName2) {
//			System.out.println(item);
//		}
		

	}

}
