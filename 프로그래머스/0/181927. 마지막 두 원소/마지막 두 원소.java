class Solution {
    public int[] solution(int[] num_list) {
        
        int[] arr = new int[num_list.length+1];
        
        for(int i = 0 ; i < num_list.length ; i++) {
            arr[i] = num_list[i];
        }
        
        if (num_list[num_list.length-1] > num_list[num_list.length-2]) {
          arr[num_list.length] = num_list[num_list.length-1] - num_list[num_list.length-2];
        } else {
            arr[num_list.length] = num_list[num_list.length-1]*2;
        }
        
        return arr;
        
        
    }
}