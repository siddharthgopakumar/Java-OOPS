
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
       System.out.println(decrypt("Sgd Azsskd ne Lzqzhr cdr Bxfmdr (/ˌlɛəq cə ˈyhːm, - ˈrhːm, ˈlɛəq cə yhːm/)[2][3] snnj okzbd nm Nbsnadq 25, 1864, hm Khmm Bntmsx, Jzmrzr, ctqhmf Oqhbd'r Lhrrntqh Qzhc hm sgd Zldqhbzm Bhuhk Vzq. Hs hr zkrn jmnvm zr sgd Azsskd ne Sqzchmf Onrs.[4] Hm kzsd 1864, Lzinq Fdmdqzk Rsdqkhmf Oqhbd hmuzcdc sgd rszsd ne Lhrrntqh vhsg z bzuzkqx enqbd, zssdloshmf sn cqzv Tmhnm sqnnor zvzx eqnl sgd oqhlzqx sgdzsdqr ne ehfgshmf etqsgdq dzrs. Zesdq rdudqzk uhbsnqhdr dzqkx hm sgd bzlozhfm, Oqhbd'r Bnmedcdqzsd sqnnor vdqd cdedzsdc zs sgd Azsskd ne Vdrsonqs nm Nbsnadq 23 mdzq Jzmrzr Bhsx, Lhrrntqh. Sgd Bnmedcdqzsdr sgdm vhsgcqdv hmsn Jzmrzr, bzlohmf zknmf sgd azmjr ne sgd Lzqzhr cdr Bxfmdr Qhudq nm sgd mhfgs ne Nbsnadq 24. Tmhnm bzuzkqx otqrtdqr tmcdq Aqhfzchdq Fdmdqzk Ingm A. Rzmanqm rjhqlhrgdc vhsg Oqhbd'r qdzqftzqc sgzs mhfgs, ats chrdmfzfdc vhsgnts ozqshbhozshmf hm gdzux bnlazs.Nudqmhfgs Rzmanqm'r sqnnor vdqd qdhmenqbdc ax bzuzkqx tmcdq Khdtsdmzms Bnknmdk Eqdcdqhbj V. Admsddm, aqhmfhmf sgd snszk Tmhnm rsqdmfsg sn 3,500. Sgd azsskd adfzm dzqkx sgd mdws lnqmhmf zr Rzmanqm cqnud Lzinq Fdmdqzk Ingm R. Lzqlzctjd'r Bnmedcdqzsd qdzqftzqc eqnl hsr onrhshnm mnqsg ne sgd qhudq. Tmhnm sqnnor bzostqdc bzmmnmr, oqhrnmdqr, zmc vzfnmr ctqhmf sghr rszfd ne sgd ehfgshmf. Lzqlzctjd zssdlosdc sn lzjd z rszmc zs sgd qhudq bqnrrhmf, ats ghr onrhshnm vzr ntsekzmjdc ax z Tmhnm bzuzkqx qdfhldms, enqbhmf ghl sn zazmcnm hs. Z qdzqftzqc zbshnm ax Bnmedcdqzsd Aqhfzchdq Fdmdqzk Ingm A. Bkzqj Iq.'r 1,200-lzm aqhfzcd antfgs Oqhbd lnqd shld sn qdsqdzs zmc chrdmfzfd. Rnld ne Oqhbd'r ldm vdqd rshkk bztfgs mdzq Lhmd Bqddj kzsdq sgzs lnqmhmf zmc vdqd azckx adzsdm hm sgd Azsskd ne Lhmd Bqddj. Sgzs dudmhmf, sgd Azsskd ne Lzqlhsnm Qhudq adbzld sgd czx'r sghqc zbshnm, zesdq vghbg Oqhbd atqmdc ghr rtookx sqzhm rn hs mn knmfdq rknvdc sgd qdsqdzs. Zesdq zmnsgdq cdedzs zs sgd Rdbnmc Azsskd ne Mdvsnmhz nm Nbsnadq 28, Oqhbd'r bnktlm qdsqdzsdc sn Sdwzr sgqntfg Zqjzmrzr zmc sgd Hmchzm Sdqqhsnqx. Nmkx 3,500 ne sgd 12,000 ldm Oqhbd gzc aqntfgs hmsn Lhrrntqh qdlzhmdc. ")); 
    }
    }
    

