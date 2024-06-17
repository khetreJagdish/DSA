package com.gfg.bitwise;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String s = capitalizeTitle("capiTalIze tHe titLe");
		System.out.println(s);
	}
	
	 public static String capitalizeTitle(String title) {
	        
	        String[] str = title.split(" ");
	        StringBuilder builder = new StringBuilder();
	        for(String s : str){
	            if(s.length() == 1 || s.length() == 2){

	                builder.append(s.toLowerCase()+" ");
	            }else{
	                String s2 = s.substring(1).toLowerCase();
	                builder.append(s.toLowerCase().substring(0,1).toUpperCase()+s2+" ");
	            }
	        }

	        return builder.toString();
	    }

}
