package space.alehandrozed.allertdialog

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        createSimpleMultiChaiseDialog()
    }

    private fun createSimpleDialog() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Alert Dialog")
        builder.setMessage("This is my first Alert Dialog")
        builder.setNeutralButton("Info", { dialog, which ->

        })
        builder.setNegativeButton("No", { dialog, whith ->

        })
        builder.setPositiveButton("Yes", { dialog, whith ->

        })
        builder.show()
    }

    private fun createSimpleMultiChaiseDialog() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Что вам больше нравиться?")
        //builder.setMessage("This is my first Alert Dialog")
        builder.setMultiChoiceItems(R.array.MultiItem, null, { dialog, whith, choise ->
            Log.d("My Log", "My Log is: " + whith + " / Is: " + choise)
        })
        builder.setNeutralButton("Info", { dialog, which ->

        })
        builder.setNegativeButton("No", { dialog, whith ->

        })
        builder.setPositiveButton("Yes", { dialog, whith ->

        })
        builder.show()
    }


}