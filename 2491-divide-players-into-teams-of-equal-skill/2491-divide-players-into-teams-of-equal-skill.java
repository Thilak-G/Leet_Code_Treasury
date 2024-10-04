class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill) ;
        long sum = 0 ;
        int n = skill.length - 2 ;
        int h = skill[0] + skill[skill.length - 1] ;
        sum += (long)(skill[0] * skill[skill.length - 1]) ;
        for(int i = 1 ; i < n ; i++){
            if(skill[i] + skill[n] != h){
                return -1 ;
            }
            else{
                sum += (long)skill[i] * skill[n] ;
            }
            n--;
        }
        return sum;
    }
}