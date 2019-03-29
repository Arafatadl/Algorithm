public class jumpFloor {
    private int way(int n){
        if(n==1 || n==0)
            return 1;

        return way(n-1)+way(n-2);
    }
    public int JampFloor(int target){
        return way(target);
    }
}
