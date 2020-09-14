package SHA256_001;

import java.util.ArrayList;
import java.util.List;

public class BlockChain {

	private List<Block> blockChain;

	public BlockChain() {
		this.blockChain = new ArrayList<>();
	}

	public List<Block> getBlockChain() {
		return blockChain;
	}

	public int size() {
		return this.blockChain.size();
	}

	public void addBlock(Block block) {
		this.blockChain.add(block);
	}

	@Override
	public String toString() {
		String blockChain = "";

		for (Block block : this.blockChain) {
			blockChain += block.toString() + "\n";
		}

		return blockChain;
	}
}
