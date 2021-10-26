
/**
 * Write a description of Decrypt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Decrypt {
    public String decrypt(String encrypted)
    {
        CaesarCipher cc = new CaesarCipher();
        int[] freqs = countLetters(encrypted);
        int maxDex = maxIndex(freqs);
        int dkey =  maxDex - 4;
        if(maxDex < 4)
        {
        dkey = 26-(4-maxDex);
        }
        return cc.encrypt(encrypted, 26-dkey, 26-dkey); //Ans)dkey = 15;
    }
    public int[] countLetters(String message)
    {
        String alph = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int[] counts = new int[26];
        for(int k=0; k< message.length(); k++)
        {
            char ch= Character.toUpperCase(message.charAt(k));
            int dex = alph.indexOf(ch);
            if(dex != -1)
            {counts[dex] += 1;
            //System.out.println(counts[dex] + "= "+ ch );
            }
        }
        return counts;
        }
     public int maxIndex(int[] vals)
        {
        int maxDex = 0;
        for(int k=0;k< vals.length; k++)
        {
            if(vals[k] > vals[maxDex])
            {
                maxDex = k;
            }
        }
        return maxDex;
    }
    public String halfOfString(String message, int start)
    {
        StringBuilder messageSB = new StringBuilder();
        for(int i=start; i< message.length(); i+=2)
        {
            messageSB.append(message.charAt(i));
        }
        return messageSB.toString();
    }
    public void tester()
    {
        System.out.println("Qbkm Zgis");
        System.out.println(halfOfString("Qbkm Zgis", 0));
        System.out.println(halfOfString("Qbkm Zgis", 1));
       System.out.println(decrypt("Iwt Qpiiat du Bpgpxh sth Rnvcth (/ˌbɛəg sə ˈoxːc, - ˈhxːc, ˈbɛəg sə oxːc/)[2][3] iddz eaprt dc Dridqtg 25, 1864, xc Axcc Rdjcin, Zpchph, sjgxcv Egxrt'h Bxhhdjgx Gpxs xc iwt Pbtgxrpc Rxkxa Lpg. Xi xh pahd zcdlc ph iwt Qpiiat du Igpsxcv Edhi.[4] Xc apit 1864, Bpydg Vtctgpa Hitgaxcv Egxrt xckpsts iwt hipit du Bxhhdjgx lxiw p rpkpagn udgrt, piitbeixcv id sgpl Jcxdc igddeh plpn ugdb iwt egxbpgn iwtpitgh du uxvwixcv ujgiwtg tphi. Puitg htktgpa kxridgxth tpgan xc iwt rpbepxvc, Egxrt'h Rdcutstgpit igddeh ltgt stutpits pi iwt Qpiiat du Lthiedgi dc Dridqtg 23 ctpg Zpchph Rxin, Bxhhdjgx. Iwt Rdcutstgpith iwtc lxiwsgtl xcid Zpchph, rpbexcv padcv iwt qpczh du iwt Bpgpxh sth Rnvcth Gxktg dc iwt cxvwi du Dridqtg 24. Jcxdc rpkpagn ejghjtgh jcstg Qgxvpsxtg Vtctgpa Ydwc Q. Hpcqdgc hzxgbxhwts lxiw Egxrt'h gtpgvjpgs iwpi cxvwi, qji sxhtcvpvts lxiwdji epgixrxepixcv xc wtpkn rdbqpi.Dktgcxvwi Hpcqdgc'h igddeh ltgt gtxcudgrts qn rpkpagn jcstg Axtjitcpci Rdadcta Ugtstgxrz L. Qtcittc, qgxcvxcv iwt idipa Jcxdc higtcviw id 3,500. Iwt qpiiat qtvpc tpgan iwt ctmi bdgcxcv ph Hpcqdgc sgdkt Bpydg Vtctgpa Ydwc H. Bpgbpsjzt'h Rdcutstgpit gtpgvjpgs ugdb xih edhxixdc cdgiw du iwt gxktg. Jcxdc igddeh rpeijgts rpccdch, egxhdctgh, pcs lpvdch sjgxcv iwxh hipvt du iwt uxvwixcv. Bpgbpsjzt piitbeits id bpzt p hipcs pi iwt gxktg rgdhhxcv, qji wxh edhxixdc lph djiuapczts qn p Jcxdc rpkpagn gtvxbtci, udgrxcv wxb id pqpcsdc xi. P gtpgvjpgs prixdc qn Rdcutstgpit Qgxvpsxtg Vtctgpa Ydwc Q. Rapgz Yg.'h 1,200-bpc qgxvpst qdjvwi Egxrt bdgt ixbt id gtigtpi pcs sxhtcvpvt. Hdbt du Egxrt'h btc ltgt hixaa rpjvwi ctpg Bxct Rgttz apitg iwpi bdgcxcv pcs ltgt qpsan qtpitc xc iwt Qpiiat du Bxct Rgttz. Iwpi tktcxcv, iwt Qpiiat du Bpgbxidc Gxktg qtrpbt iwt spn'h iwxgs prixdc, puitg lwxrw Egxrt qjgcts wxh hjeean igpxc hd xi cd adcvtg hadlts iwt gtigtpi. Puitg pcdiwtg stutpi pi iwt Htrdcs Qpiiat du Ctlidcxp dc Dridqtg 28, Egxrt'h rdajbc gtigtpits id Itmph iwgdjvw Pgzpchph pcs iwt Xcsxpc Itggxidgn. Dcan 3,500 du iwt 12,000 btc Egxrt wps qgdjvwi xcid Bxhhdjgx gtbpxcts. ")); 
    }
    }
    

