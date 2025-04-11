import java.util.*;
public class subset {
    public static void main(String[] args) {
       

    }
    public static void printSub(int[] arr, int target){
        List<List<Integer>> res= new ArrayList<>();
        findSubset(arr, 0, 6, new ArrayList<>(), res);

        if(res.isEmpty()){
            System.out.println("no subset found"+ target);
        }
        else{
            for(List<Integer> subset: res){
                System.out.println(subset);
            }
        }
 
    }
    public static void findSubset(int[] arr, int index, int target, List<Integer> current, List<List<Integer>> res, List<Integer>> res){
        if(target==0){
            res.add(new ArrayList<>(current));
            return;
        }
        for(int i=index; i<arr.length; i++){
            if(arr[i]> target){
                continue;
            }
            current.add(arr[i]);

            findSubset(arr, i+1, target-arr[i], current, res);
            current.remove(current.size()-1);
        }
    }

}




