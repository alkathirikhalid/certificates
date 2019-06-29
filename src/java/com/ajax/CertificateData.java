package com.ajax;

import java.util.HashMap;

/**
 *
 * @author alkathirikhalid www.alkathirikhalid.com
 */
public class CertificateData {
    
    private HashMap certificates = new HashMap();
    

    public HashMap getCertificates() {
        return certificates;
    }
    
    public CertificateData() {
        // Uni Foundation after added values update cert range in controler
        certificates.put("100091", new Certificate("100091", "Erico", "Hermanoy", "Android Foundation Certificate"));
        certificates.put("100092", new Certificate("100092", "Fransisca", "Angelia", "Android Foundation Certificate"));
        certificates.put("100093", new Certificate("100093", "Dwi", "Yunantara", "Android Foundation Certificate"));
        certificates.put("100094", new Certificate("100094", "Desi", "Martati", "Android Foundation Certificate"));
        certificates.put("100095", new Certificate("100095", "Firman", "Susanto", "Android Foundation Certificate"));
        
        certificates.put("100096", new Certificate("100096", "Joshua", "Oktavian", "Android Foundation Certificate"));
        certificates.put("100097", new Certificate("100097", "Louis", "Casanova", "Android Foundation Certificate"));
        certificates.put("100098", new Certificate("100098", "Menno", "Carl", "Android Foundation Certificate"));
        certificates.put("100099", new Certificate("100099", "Oktavianus", "Denisatriya", "Android Foundation Certificate"));
        certificates.put("100100", new Certificate("100100", "Kevin", "Setiawan", "Android Foundation Certificate"));
        
        certificates.put("100101", new Certificate("100101", "Yohanes", "Christianto", "Android Foundation Certificate"));
        certificates.put("100102", new Certificate("100102", "Jimmy", "Setiawan", "Android Foundation Certificate"));
    }

}