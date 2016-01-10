package self.srijit.os;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends ListActivity {
    String[] os={"Mac OS","Windows","Linux","iOS","Windows Phone OS","Android"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_multiple_choice,os));
    }



    @Override
    protected void onListItemClick(ListView l, View v, int position, long id)
    {
        Toast.makeText(MainActivity.this, "You have selected " + os[position] , Toast.LENGTH_SHORT).show();
        Intent intent=new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        switch(position)
        {
            case 0:
                intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Mac_OS"));
                startActivity(intent);
                break;
            case 1:
                intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Microsoft_Windows"));
                startActivity(intent);
                break;
            case 2:
                intent.setData(Uri.parse(int"https://en.wikipedia.org/wiki/Linux"));
                startActivity(intent);
                break;
            case 3:
                intent.setData(Uri.parse("https://en.wikipedia.org/wiki/IOS"));
                startActivity(intent);
                break;
            case 4:
                intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Windows_Phone"));
                startActivity(intent);
                break;
            case 5:
                intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Android_(operating_system)"));
                startActivity(intent);
                break;
        }
    }
}
