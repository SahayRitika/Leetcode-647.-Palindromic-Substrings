class Solution {
    public boolean isPalin(String s){

        StringBuffer sbr= new StringBuffer(s);
        String st=sbr.reverse().toString();
        if(s.equals(st)){
            return true;
        }
        else{
            return false;
        }
    }
    public int countSubstrings(String s) {
        int n=s.length(),i,j,count=0;
        for(i=0;i<n;i++){
            for(j=i;j<n;j++){
              String st=s.substring(i,j+1);
              //System.out.println(st);
              if(isPalin(st)){count++;}
            }
        }
        return count;
    }
}
