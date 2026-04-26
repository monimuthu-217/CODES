class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> path= new ArrayList<>();
        traverse(root,path,list,0,targetSum);
        return list;
    }
    void traverse(TreeNode root,List<Integer> path,List<List<Integer>> list,int sum,int target){
        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null){
            path.add(root.val);
            sum+=root.val;
            if(sum==target){
                list.add(new ArrayList<>(path));
            }
            sum-=root.val;
            path.remove(path.size()-1);
            return;
        }
        path.add(root.val);
        sum+=root.val;
        if(root.left!=null){
            traverse(root.left,path,list,sum,target);
        }
        if(root.right!=null){
            traverse(root.right,path,list,sum,target);
        }
        sum-=root.val;
        path.remove(path.size()-1);
    }
}
