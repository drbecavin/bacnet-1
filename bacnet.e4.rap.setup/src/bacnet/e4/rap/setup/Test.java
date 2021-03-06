package bacnet.e4.rap.setup;

import bacnet.datamodel.annotation.Annotation;
import bacnet.datamodel.sequence.Genome;
import bacnet.datamodel.sequenceNCBI.GenomeConversion;
import bacnet.datamodel.sequenceNCBI.GenomeNCBI;
import bacnet.datamodel.sequenceNCBI.GenomeNCBITools;
import bacnet.reader.TabDelimitedTableReader;
import bacnet.scripts.genome.RASTEGDeGenome;
import bacnet.scripts.listeriomics.Peptidomics;

/**
 * All methods which will be executed before or after interface run
 * @author ipmc
 *
 */
public class Test {
	
	/**
	 * Run pre-test methods before interface creation
	 */
	public static void runPreTest() {
//		System.out.println("Run Pre-test");
//		 RASTEGDeGenome.run();
//		Genome genome = Genome.loadEgdeGenome();
//		System.out.println(genome.getSpecies());
//		
//		TabDelimitedTableReader.save(Annotation.getAnnotationGenes(genome,genome.getFirstChromosome().getGeneNameList()),"C:\\Users\\ipmc\\Desktop\\EGDe.txt");
		
//		Peptidomics.run();
//		String genome = "Listeria monocytogenes 2015TE24968";
//		GenomeNCBI genomeNCBI = GenomeNCBITools.loadGenome(genome, GenomeNCBI.PATH_GENOMES, false, true);
//        GenomeConversion.run(genomeNCBI, GenomeNCBI.PATH_GENOMES + "/" + genome, genome);
//        Genome genomeTemp = Genome.loadGenome(genome);
//        String message = "";
//        if (genomeTemp == null) {
//        	message += genome + " does not exists. Click: Add unvalidated Genome to the database" + "\n";
//        } else if (genomeTemp.getFirstChromosome().getGenes().size() == 0) {
//        	message += genome + " was not added to the database, check errors in the console" + "\n";
//        } else {
//        	message += genome + " was added to the database" + "\n";
//            message += "Save Protein to Locus tag hashmap for faster computing of homolog search: " + genome;
//            genomeTemp.saveProteinIdToLocusTag();
//        }
//        System.out.println(message);
	}
	
	/**
	 * Run post--test after interface creation
	 */
	public static void runPostTest() {
		System.out.println("Run Post-test");
		
//		for(String genome : Genome.getAvailableGenomes()) {
//			Genome genomeTemp = Genome.loadGenome(genome);
//        	genomeTemp.saveProteinIdToLocusTag();
//		}
	}

}
