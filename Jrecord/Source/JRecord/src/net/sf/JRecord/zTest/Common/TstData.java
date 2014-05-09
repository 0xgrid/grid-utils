/*
 * @Author Bruce Martin
 * Created on 18/03/2007
 *
 * Purpose:
 */
package net.sf.JRecord.zTest.Common;

/**
 *
 *
 * @author Bruce Martin
 *
 */
public class TstData {

    public static final String[] AMS_RECEIPT_RD_LINES = {
            "RDTAR000265      9890002174489000000025382070000000000001EN00000003800000100000000021120EQBD180 2005-08-08-11.16.22.103514000000016" ,
            "RDTAR000270      9890002174490000000025382150000000000001EN00000003800000100000000021120EQBD180 2005-08-08-11.16.54.206815000000016",
            "RDTAR000641      9251002176801000000025450780000000000001EN00000024200000100000000037360EQBD180 2005-08-08-12.08.36.923214000000033",
            "RDTAR000646      9251002176802000000025452400000000000001EN00000015400000100000000059990EQBD180 2005-08-08-12.07.33.907442000000032",
            "RDTAR000671      9251002176803000000025453250000000000001EN00000035200000100000000038580EQBD180 2005-08-08-12.07.33.836883000000033",
            "RDTAR000825      9251002178390000000025640910000000000001EN00000005100000100000000069700EQBD180 2005-08-08-13.20.02.058913000000040",
            "RDTAR000404      9890002174491000000025741060000000000001EN00000001000000100000000058980EQBD180 2005-08-08-11.23.28.397425000000008",
            "RDTAR000811      9890002174492000000026000950000000000001EN00000001000000100000000058980EQBD180 2005-08-08-11.18.43.843701000000008",
            "RDTAR000918      9251002178391000000026189530000000000001EN00000011100000100000000071400EQBD180 2005-08-08-13.18.08.030294000000040",
            "RDTAR000951      9251002178392000000026190510000000000001EN00000006200000100000000066000EQBD180 2005-08-08-13.29.59.408890000000040",
            "RDTAR000429      9601002172645000000026401450000000000001EN00000018400000100000000077700EQBD180 2005-08-08-12.00.32.870665000000014",
            "RDTAR000923      9251002178393000000026534720000000000001EN00000011700000100000000078560EQBD180 2005-08-08-13.32.03.992558000000040",
            "RDTAR000265      9890002174493000000026924710000000000001EN00000005100000100000000027800EQBD180 2005-08-08-11.19.20.432891000000015",
            "RDTAR000265      9890002174493000000026924750000000000002EN00000006300000100000000027800EQBD180 2005-08-08-11.19.20.461911000000015",
            "RDTAR000265      9890002174493000000026924770000000000003EN00000004400000100000000027800EQBD180 2005-08-08-11.19.20.487144000000015",
            "RDTAR000195      9890002174494000000027045550000000000001EN00000003300000100000000036820EQBD180 2005-08-08-11.19.28.975607000000015",
            "RDTAR000195      9890002174494000000027045560000000000002EN00000003500000100000000036820EQBD180 2005-08-08-11.19.29.005125000000015",
            "RDTAR000195      9890002174494000000027045590000000000003EN00000002000000100000000036820EQBD180 2005-08-08-11.19.29.024538000000015",
            "RDTAR000209      9890002174495000000027046280000000000001EN00000006000000100000000057150EQBD180 2005-08-08-11.21.10.410366000000015",
            "RDTAR000209      9890002174495000000027046290000000000002EN00000006500000100000000057150EQBD180 2005-08-08-11.21.10.429365000000015",
            "RDTAR000209      9890002174495000000027046340000000000003EN00000004700000100000000057150EQBD180 2005-08-08-11.21.10.444815000000015",
            "RDTAR000283      9251002180238000000027052460000000000001EN00000012200000100000000066240EQBD180 2005-08-08-11.54.34.705350000000040",
            "RDTAR000360      9251002180239000000027057210000000000001EN00000012200000100000000078880EQBD180 2005-08-08-11.53.33.622387000000040",
            "RDTAR000517      9890002174496000000028149770000000000001EN00000004000000100000000023000EQBD180 2005-08-08-11.21.10.634079000000015",
    };

    public static final byte[][] DTAR020_LINES = {
	        { -10,  -7, -10,  -7, -12, -15, -11,  -8,   2,  12,   0,  64,  17,-116
	             ,  40,  12,   0,   0,   0,   0,  28,   0,   0,   0,   0,  80,  28 },
	        { -10, -13, -10, -16, -12,  -8, -16,  -8,   2,  12,   0,  64,  17,-116
	             ,  23,  12,   0,   0,   0,   0,  28,   0,   0,   0,   0,  72, 124 },
	        { -10, -14, -10,  -8, -12, -10,  -9, -15,   2,  12,   0,  64,  17,-116
	             , 104,  92,   0,   0,   0,   0,  28,   0,   0,   0,   6,-103,-100 },
	        { -10, -14, -10,  -8, -12, -10,  -9, -15,   2,  12,   0,  64,  17,-116
	             , 104,  92,   0,   0,   0,   0,  29,   0,   0,   0,   6,-103, -99 },
	        { -10, -12, -10, -13, -12, -12, -14,  -7,   2,  12,   0,  64,  17,-116
	             ,-107, 124,   0,   0,   0,   0,  28,   0,   0,   0,   0,  57,-100 }
	};

    public static final byte[][] DTAR107_LINES = {
            {3, 124, 0, 80, 50, 76, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64,
                64, 64, -12, 0, 0, 1, 25, 92, 0, 0, 4, 0, 28, 7, 28, 1, 68, -100, 6,
                40, -116, -16, -15, -15, -16, 0, 0, 0, 12, 0, 0, 0, 12, -16, -15, },
               {3, 124, 0, 80, 50, 76, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64,
                64, 64, -13, 0, 0, 0, -107, 12, 0, 0, 4, 0, 28, 7, 28, 1, 69, 12, 6,
                40, -100, -16, -15, -15, -16, 0, 0, 0, 12, 0, 0, 0, 12, -16, -15, },
               {3, 124, 0, 80, 50, 76, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64,
                64, 64, -15, 0, 0, 1, -119, -100, 0, 0, 4, 0, 28, 7, 28, 1, 69, 12, 6,
                41, 76, -16, -13, -15, -16, 0, 0, 0, 12, 0, 0, 0, 12, -16, -15, },
               {3, 124, 0, 80, 50, 76, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64,
                64, 64, -11, 0, 0, 3, 64, 12, 0, 0, 4, 0, 28, 7, 28, 1, 69, 28, 6,
                41, 92, -16, -13, -15, -16, 0, 0, 0, 12, 0, 0, 0, 12, -16, -15, },
               {3, 124, 0, 80, 50, 76, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64,
                64, 64, -11, 0, 0, 2, 68, 108, 0, 0, 4, 0, 28, 7, 28, 1, 69, 44, 6,
                41, 108, -16, -13, -15, -16, 0, 0, 0, 12, 0, 0, 0, 12, -16, -15, },
               {3, 124, 0, 80, 50, 76, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64,
                64, 64, -12, 0, 1, 0, 0, 13, 0, 0, 4, 0, 28, 7, 28, 1, 68, -116, 6,
                40, 108, -16, -14, -14, -16, 0, 0, 0, 12, 0, 0, 0, 12, -16, -15, },
    };

    public static final byte[][] FUTJISU_LINES = {
    {-111, 0, 0, 0, 82, 101, 99, 111, 114, 100, 32, 78, 117, 109, 98, 101, 114, 32, 49,
        32, 65, 108, 112, 104, 97, 32, 102, 105, 101, 108, 100, 32, 49, 32, 32, 32, 32, 32,
        32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, },
       {48, 48, 50, 45, 50, 52, 57, 55, 53, 53, 50, 52, 57, 55, 53, 85, 2, 73, 117,
        93, -1, -4, 48, 101, 45, 49, 48, 51, 48, 50, 55, 49, 48, 51, 48, 50, 87, 1,
        3, 2, 125, -1, -2, 109, -115, 82, 101, 99, 111, 114, 100, 32, 78, 117, },
       {109, 98, 101, 114, 32, 49, 32, 65, 108, 112, 104, 97, 32, 102, 105, 101, 108, 100, 32,
        50, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32,
        32, 32, 32, -111, 0, 0, 0, 124, 0, 0, 0, 82, 101, 99, 111, 114, },
       {100, 32, 78, 117, 109, 98, 101, 114, 32, 50, 32, 65, 108, 112, 104, 97, 32, 102, 105,
        101, 108, 100, 32, 49, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32,
        32, 32, 32, 32, 32, 32, 32, 48, 48, 49, 45, 51, 54, 56, 56, 56, },
       {49, 51, 54, 56, 56, 56, 81, 3, 104, -120, 29, -1, -6, 95, 15, 82, 101, 99, 111,
        114, 100, 32, 78, 117, 109, 98, 101, 114, 32, 50, 32, 65, 108, 112, 104, 97, 32, 102,
        105, 101, 108, 100, 32, 50, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, },
       {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 124, 0, 0, 0, -111, 0, 0, 0,
        82, 101, 99, 111, 114, 100, 32, 78, 117, 109, 98, 101, 114, 32, 51, 32, 65, 108, 112,
        104, 97, 32, 102, 105, 101, 108, 100, 32, 49, 32, 32, 32, 32, 32, 32, },
       {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 48, 48, 50, 43,
        53, 51, 55, 56, 55, 50, 53, 51, 55, 56, 55, 66, 5, 55, -121, 44, 0, 8, 53,
        16, 45, 53, 48, 56, 57, 54, 55, 53, 48, 56, 57, 54, 87, 5, 8, },
       {-106, 125, -1, -8, 59, -39, 82, 101, 99, 111, 114, 100, 32, 78, 117, 109, 98, 101, 114,
        32, 51, 32, 65, 108, 112, 104, 97, 32, 102, 105, 101, 108, 100, 32, 50, 32, 32, 32,
        32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, },
       {32, 32, -111, 0, 0, 0, -111, 0, 0, 0, 82, 101, 99, 111, 114, 100, 32, 78, 117,
        109, 98, 101, 114, 32, 52, 32, 65, 108, 112, 104, 97, 32, 102, 105, 101, 108, 100, 32,
        49, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, },
       {32, 32, 32, 32, 32, 32, 48, 48, 50, 43, 57, 51, 56, 51, 52, 57, 57, 51, 56,
        51, 52, 73, 9, 56, 52, -100, 0, 14, 81, 109, 43, 52, 52, 53, 49, 54, 51, 52,
        52, 53, 49, 54, 67, 4, 69, 22, 60, 0, 6, -54, -21, 82, 101, 99, },
       {111, 114, 100, 32, 78, 117, 109, 98, 101, 114, 32, 52, 32, 65, 108, 112, 104, 97, 32,
        102, 105, 101, 108, 100, 32, 50, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32,
        32, 32, 32, 32, 32, 32, 32, 32, 32, -111, 0, 0, 0, -111, 0, 0, },
       {0, 82, 101, 99, 111, 114, 100, 32, 78, 117, 109, 98, 101, 114, 32, 53, 32, 65, 108,
        112, 104, 97, 32, 102, 105, 101, 108, 100, 32, 49, 32, 32, 32, 32, 32, 32, 32, 32,
        32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 48, 48, 50, },
       {43, 54, 57, 53, 53, 53, 56, 54, 57, 53, 53, 53, 72, 6, -107, 85, -116, 0, 10,
        -99, 6, 45, 54, 51, 50, 56, 51, 48, 54, 51, 50, 56, 51, 80, 6, 50, -125, 13,
        -1, -10, 88, 2, 82, 101, 99, 111, 114, 100, 32, 78, 117, 109, 98, 101, },
       {114, 32, 53, 32, 65, 108, 112, 104, 97, 32, 102, 105, 101, 108, 100, 32, 50, 32, 32,
        32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32,
        -111, 0, 0, 0, -111, 0, 0, 0, 82, 101, 99, 111, 114, 100, 32, 78, },
       {117, 109, 98, 101, 114, 32, 54, 32, 65, 108, 112, 104, 97, 32, 102, 105, 101, 108, 100,
        32, 49, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32,
        32, 32, 32, 32, 48, 48, 50, 43, 50, 51, 51, 55, 56, 48, 50, 51, }
    };


    /**
     *
     */
    private TstData() {
        super();
    }

}
