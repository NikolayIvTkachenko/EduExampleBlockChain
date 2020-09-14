package SHA256_001;



public class Miner {

    private double reward;
    
    public void mine(Block block, BlockChain blockChain){
        int difficulty = Constants.DIFFICULTY;
        
        while(notGoldenHash(block)){
            block.generateHash();
            block.incrementNonce();
        }
        
        System.out.println(block + " has just mined... ");
        System.out.println("Hash is: " + block.getHash());
        
        blockChain.addBlock(block);
        reward += Constants.MINER_REWARD;
        
    }

    
    private boolean notGoldenHash(Block block) {
        String leadingZeros = new String(new char[Constants.DIFFICULTY]).replace('\0', '0');
        return !block.getHash().substring(0, Constants.DIFFICULTY).equals(leadingZeros);
    }
    
    private boolean notGoldenHash(Block block, int difficulty) {
        String leadingZeros = new String(new char[difficulty]).replace('\0', '0');
        return !block.getHash().substring(0, Constants.DIFFICULTY).equals(leadingZeros);
    }

    public double getReward() {
        return reward;
    }
}
