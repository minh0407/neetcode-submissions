class Solution {
    public int calPoints(String[] operations) {
    Stack<Integer> stack = new Stack<>();
    for(String op : operations){
        if(op.equals("+")){
           int size = stack.size();
            stack.push(stack.get(size - 1) + stack.get(size - 2));
        }
        else if(op.equals("C")){
            stack.pop();

        }
        else if(op.equals("D")){
            stack.push(2* stack.peek());
        }
        else{
            stack.push(Integer.parseInt(op));
        }
    }
    int sum = 0 ;
    for(int score : stack){
        sum+= score;
    }
    return sum;
    }
}