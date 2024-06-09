public class Tree {

    public boolean hasLeaves;
    public int numRings = 100;
    public static int numTrees;

    public Tree(boolean hasLeaves) {
        this.hasLeaves = hasLeaves;
        numTrees++;
    }

    public boolean getHasLeaves() {
        return hasLeaves;
    }

    public static int getNumTrees() {
        return numTrees;
    }

    public void grow() {
        numRings++;
        System.out.println("Number of rings " + numRings);
        System.out.println(getNumRings());
    }

    public int getNumRings() {
        return numRings;
    }

    public String toString() {
        return "This is a tree.";
    }


    public static void main(String[] args) {
        Tree tree1 = new Tree(true);
        Tree tree2 = new Maple();
        Maple tree6 = (Maple) tree2;
        Maple tree3 = new Maple();
        Tree tree4 = new Maple();
        Tree tree5 = new Tree(false);

        System.out.println(tree1.getHasLeaves());
        System.out.println(tree2.getHasLeaves());
        System.out.println(tree3.getHasLeaves());

        System.out.println(tree1);
        System.out.println(tree2);
        System.out.println(tree3);


        tree1.grow();
        tree2.grow();
        tree3.grow();
        ((Maple) tree4).grow();



        System.out.println(tree1.getNumRings());
        System.out.println(tree2.getNumRings());
        System.out.println(tree3.getNumRings());
        System.out.println(tree4.getNumRings());
        System.out.println(numTrees);

        System.out.println(tree2.equals(tree1));
        System.out.println(tree1.equals(tree5));
        System.out.println(((Maple) tree4).equals(tree3));
        System.out.println(tree3.equals((Maple) tree4));
    }

}