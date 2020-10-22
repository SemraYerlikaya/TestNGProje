package com.techproed.excelautomation;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;

import java.io.IOException;


public class ReadExcel {
    @Test
    public void test() throws IOException {
        //Javada bir dosyayi acmak icin bu kullanilir.
        //Parametre bolumune acmak istedigimiz dosyanin adresi (dosya yolu-path )yazilir.
        FileInputStream fileInputStream=new FileInputStream("src/test/resources/ULKELER.xlsx");

           // Workbook (excel) dosyasını okumaya başladık.
            Workbook workbook = WorkbookFactory.create(fileInputStream);

            //1. sayfaya gider (index degeri 0 dan baslar)

        Sheet sheet= workbook.getSheetAt(0);
        // 1. satira gider (index degeri 0 dan baslar)
     Row row =sheet.getRow(0);
     // 11. hucreyi alalim (index degeri 0 dan baslar)
     Cell cell=row.getCell(0);
     Cell ulkeler=row.getCell(0);
     Cell baskentler=row.getCell(1);
     Cell meshur=row.getCell(2);

        System.out.println(ulkeler);
        System.out.println(baskentler);
        System.out.println(meshur);

        System.out.println(workbook.getSheetAt(0).getRow(3).getCell(1));
        System.out.println(workbook.getSheetAt(0).getRow(7).getCell(2));
        System.out.println(workbook.getSheetAt(0).getRow(10).getCell(0));

        //Son satir (row) in numarasini almak icin (index, index 0 dan baslar)

        int satirSayisi= workbook.getSheetAt(0).getLastRowNum()+1;
        System.out.println("Satir sayisi:"+ satirSayisi);

        //Icerisinde veri olan satir sayisini almak isterseniz
        //index i 1 den basliyor

        int doluSatirSayisi= workbook.getSheetAt(0).getPhysicalNumberOfRows();
        System.out.println("Dolu satir sayisi:"+ doluSatirSayisi);

      int sonSatirinIndexi= workbook.getSheetAt(0).getLastRowNum();

      for (int i=0; i<=sonSatirinIndexi; i++){
          System.out.println(workbook.getSheetAt(0).getRow(i).getCell(0));
      }



        for (int i=0; i<=sonSatirinIndexi; i++) {
            System.out.println(workbook.getSheetAt(0).getRow(i).getCell(1));

        }

        // bir satırın son sütunun indexini alma
        int sonSutunIndex = workbook.getSheetAt(0).getRow(0).getLastCellNum();
        System.out.println("Son Sütun İndex : " + sonSutunIndex);

        for (int i=0; i<=sonSutunIndex-1; i++) {
            System.out.println(workbook.getSheetAt(0).getRow(3).getCell(i));

        }

    }
}
