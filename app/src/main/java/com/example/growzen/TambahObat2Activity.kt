package com.example.growzen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.google.android.material.bottomnavigation.BottomNavigationView
import android.app.AlarmManager
import android.app.AlarmManager.INTERVAL_DAY
import android.app.AlarmManager.RTC_WAKEUP
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.os.Build
import android.widget.Toast
import com.example.growzen.databinding.ActivityTambahObat2Binding
import com.google.android.material.timepicker.MaterialTimePicker
import com.google.android.material.timepicker.TimeFormat
import java.util.Calendar



class TambahObat2Activity : AppCompatActivity() {

    private lateinit var binding : ActivityTambahObat2Binding
    private lateinit var timePicker: MaterialTimePicker
    private lateinit var calendar : Calendar
    private lateinit var alarmManager: AlarmManager
    private lateinit var pendingIntent: PendingIntent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_tambah_obat2)

        binding = ActivityTambahObat2Binding.inflate(layoutInflater)

        setContentView(binding.root)

        createNotificationChannel()

        binding.btnSelectTime.setOnClickListener {
            showTimePicker()
        }

        binding.btnSetAlarm.setOnClickListener {
            setAlarm()
        }

        binding.btnCancelAlarm.setOnClickListener {
            cancelAlarm()
        }

        //fungsi klik untuk bottom navigation


//        val alarm = findViewById<Button>(R.id.btn_simpan)
//        alarm.setOnClickListener {
//            val intent = Intent(this@TambahObat2Activity, MainActivity::class.java)
//            startActivity(intent)
//        }

    }

    private fun cancelAlarm() {
        alarmManager = getSystemService(ALARM_SERVICE) as AlarmManager
        val intent = Intent(this, AlarmReceiver::class.java)

        pendingIntent = PendingIntent.getBroadcast(this,0,intent,PendingIntent.FLAG_MUTABLE)

        alarmManager.cancel(pendingIntent)

        Toast.makeText(this, "Alarm cancelled", Toast.LENGTH_LONG).show()
    }

    private fun showTimePicker() {
        timePicker = MaterialTimePicker.Builder()
            .setTimeFormat(TimeFormat.CLOCK_12H)
            .setHour(12)
            .setMinute(0)
            .setTitleText("Atur Waktu Alarm")
            .build()

        timePicker.show(supportFragmentManager, "Growzen")

        timePicker.addOnPositiveButtonClickListener {
            if (timePicker.hour > 12) {
                binding.tvCurrentAlarmSet.text =
                    String.format("%02d", timePicker.hour - 12) + " : " +
                            String.format("%02d", timePicker.minute) + " PM"
            } else {
                binding.tvCurrentAlarmSet.text =
                    String.format("%02d", timePicker.hour) + " : " +
                            String.format("%02d", timePicker.minute) + " AM"
            }

            calendar = Calendar.getInstance()
            calendar[Calendar.HOUR_OF_DAY] = timePicker.hour
            calendar[Calendar.MINUTE] = timePicker.minute
            calendar[Calendar.SECOND] = 0
            calendar[Calendar.MILLISECOND] = 0
        }
    }

    private fun setAlarm() {
        alarmManager = getSystemService(ALARM_SERVICE) as AlarmManager
        val intent = Intent(this, AlarmReceiver::class.java)

        pendingIntent = PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_MUTABLE)
        alarmManager.setInexactRepeating(
            AlarmManager.RTC_WAKEUP,
            calendar.timeInMillis,
            AlarmManager.INTERVAL_FIFTEEN_MINUTES,
            pendingIntent
        )

        Toast.makeText(this, "Alarm Berhasil", Toast.LENGTH_LONG).show()
    }


    private fun createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name: CharSequence = "alarmManagerReminderChannel"
            val description = "Channel for Alarm Manager"
            val importance = NotificationManager.IMPORTANCE_HIGH
            val channel = NotificationChannel("Growzen", name, importance)
            channel.description = description
            val notificationManager = getSystemService(
                NotificationManager::class.java
            )

            notificationManager.createNotificationChannel(channel)

        }
    }

}