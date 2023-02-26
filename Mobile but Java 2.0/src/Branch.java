public class Branch extends Structure {
    private double length;
    private Structure struct;

    //complete the constructor and methods
    public Branch(double length, Structure struct) {
        this.length = length;
        this.struct = struct;

    }

    public double getLength() {
        return this.length;
    }

    public Structure getStructure() {
        return this.struct;
    }

    public double torque() {
        return struct.getWeight() * this.length; //need weight of structure, getting the length of the structure as well



    }
}