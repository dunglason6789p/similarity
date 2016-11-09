package org.xm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xm.similarity.phrase.PhraseSimilarity;
import org.xm.similarity.word.CharBasedSimilarity;
import org.xm.similarity.word.clin.CilinSimilarity;

/**
 * Similarity 相似度计算工具包
 *
 * @author xuming
 */
public class Similarity {
    private static final Logger logger = LoggerFactory.getLogger(Similarity.class);

    public static final class Config {
        /**
         * 词林编码路径
         */
        public static String CilinPath = "data/cilin.db.gz";
        /**
         * 拼音词典路径
         */
        public static String PinyinPath = "data/F02-GB2312-to-PuTongHua-PinYin.txt";
        /**
         * concept路径
         */
        public static String ConceptPath = "data/concept.dat";
        /**
         * concept.xml.gz路径
         */
        public static String ConceptXmlPath = "data/concept.xml.gz";
        /**
         * 义原关系的路径
         */
        public static String SememePath = "data/sememe.dat";
        /**
         * 义原数据路径
         */
        public static String SememeXmlPath = "data/sememe.xml.gz";
    }

    private Similarity() {
    }


    /**
     * 词语相似度
     * 计算词林编码相似度
     *
     * @param word1
     * @param word2
     * @return
     */
    public static double cilinSimilarity(String word1, String word2) {
        return CilinSimilarity.getInstance().getSimilarity(word1, word2);
    }

    /**
     * 词语相似度
     * 计算字面相似度
     *
     * @param word1
     * @param word2
     * @return
     */
    public static double charBasedSimilarity(String word1, String word2) {
        return CharBasedSimilarity.getInstance().getSimilarity(word1, word2);
    }

    /**
     * 词语相似度
     * 计算语义概念相似度
     *
     * @param word1
     * @param word2
     * @return
     */
    public static double conceptSimilarity(String word1, String word2) {
        return 0.0;
//                ConceptSimilarity.getInstance().getSimilarity(word1, word2);
    }

    /**
     * 短语相似度
     *
     * @param pharse1
     * @param pharse2
     * @return
     */
    public static double phraseSimilarity(String pharse1, String pharse2) {
        return PhraseSimilarity.getInstance().getSimilarity(pharse1, pharse2);
    }

    /**
     * 句子相似度
     * 词形和词序结合法
     *
     * @param sentence1
     * @param sentence2
     * @return
     */
    public static double morphoSimilarity(String sentence1, String sentence2) {
        return 0.0;
//                MorphoSimilarity.getInstance().getSimilarity(sentence1, sentence2);
    }

    /**
     * 句子相似度
     * 标准编辑距离法
     *
     * @param sentence1
     * @param sentence2
     * @return
     */
    public static double editDistanceSimilarity(String sentence1, String sentence2) {
        return 0.0;
//                EditDistanceSimilarity.getInstance().getSimilarity(sentence1, sentence2);
    }

    /**
     * 句子相似度
     * Gregor编辑距离算法
     *
     * @param sentence1
     * @param sentence2
     * @return
     */
    public static double gregorEditDistanceSimilarity(String sentence1, String sentence2) {
        return 0.0;
//                GregorEditDistanceSimilarity.getInstance().getSimilarity(sentence1, sentence2);
    }

    /**
     * 词语情感分析
     *
     * @param word
     * @return
     */
    public static double Tendency(String word) {
        return 0.0;
//                HownetWordTendency.getInstance().getSentiment(word);
    }

}

