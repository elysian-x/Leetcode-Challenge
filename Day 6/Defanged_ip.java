class Solution {
    public String defangIPaddr(String address) {
        String deaddress = address.replace(".","[.]");
        return deaddress;
    }
}
