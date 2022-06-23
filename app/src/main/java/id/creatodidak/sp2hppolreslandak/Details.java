package id.creatodidak.sp2hppolreslandak;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import com.github.barteksc.pdfviewer.PDFView;

public class Details extends AppCompatActivity {
    String pdfurl, url;
    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

    }
}