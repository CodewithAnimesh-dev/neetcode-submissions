class Solution {
        public int evalRPN(String[] tokens) {
                Stack<Integer> stack=new Stack<>();
                        for(int i=0;i<tokens.length;i++){
                                    String curr=tokens[i];
                                                if(curr.equals("+")) stack.push(stack.pop()+stack.pop());
                                                            else if(curr.equals("-")){
                                                                            int second=stack.pop();
                                                                                            int first=stack.pop();
                                                                                                            stack.push(first-second);
                                                                                                                        }else if(curr.equals("*")) stack.push(stack.pop()*stack.pop());
                                                                                                                                    else if(curr.equals("/")){
                                                                                                                                                    int second=stack.pop();
                                                                                                                                                                    int first=stack.pop();
                                                                                                                                                                                    stack.push(first/second);
                                                                                                                                                                                                }else stack.push(Integer.parseInt(curr));
                                                                                                                                                                                                        }
                                                                                                                                                                                                                return stack.peek();
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    }
