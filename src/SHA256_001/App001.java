package SHA256_001;



public class App001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*System.out.println(SHA256Helper.hash(SHA256Helper.hash("Hello world")));
		System.out.println(SHA256Helper.hash(SHA256Helper.hash("Hello world")));
		
		System.out.println(SHA256Helper.hash("Hello world2"));*/
		
        BlockChain blockChain = new BlockChain();
        Miner miner = new Miner();
        
        Block block0 = new Block(0, "transaction1", Constants.GENESIS_PREV_HASH);
        miner.mine(block0, blockChain);
        
        Block block1 = new Block(1, "transaction2", blockChain.getBlockChain().get(blockChain.size()-1).getHash());
        miner.mine(block1, blockChain);
        
        Block block2 = new Block(2, "transaction3", blockChain.getBlockChain().get(blockChain.size()-1).getHash());
        miner.mine(block2, blockChain);
        
        
        System.out.println("\n" + "BLOCKCHAIN:\n"+blockChain);
        System.out.println("Miner's reward: " + miner.getReward());

	}

}
