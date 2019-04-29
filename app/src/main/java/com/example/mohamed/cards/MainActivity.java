package com.example.mohamed.cards;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView img1, img2, img3, img4, img5, img6, img7, img8,
            img9, img10, img11, img12, img13, img14, img15, img16;

    TextView tr_txv;

    Button new_btn;

    boolean flag1, flag2, flag3, flag4, flag5, flag6, flag7, flag8,
            flag9, flag10, flag11, flag12, flag13, flag14, flag15, flag16;

    int tr = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1 = (ImageView) findViewById(R.id.imageView); //EGY
        img2 = (ImageView) findViewById(R.id.imageView2); //FR
        img3 = (ImageView) findViewById(R.id.imageView3); //US
        img4 = (ImageView) findViewById(R.id.imageView4); //EGY
        img5 = (ImageView) findViewById(R.id.imageView5); //US
        img6 = (ImageView) findViewById(R.id.imageView6); //ALG
        img7 = (ImageView) findViewById(R.id.imageView7); //ALG
        img8 = (ImageView) findViewById(R.id.imageView8); //GER
        img9 = (ImageView) findViewById(R.id.imageView9); //ITL
        img10 = (ImageView) findViewById(R.id.imageView10); //CH
        img11 = (ImageView) findViewById(R.id.imageView11); //GER
        img12 = (ImageView) findViewById(R.id.imageView12); //FR
        img13 = (ImageView) findViewById(R.id.imageView13); //ITL
        img14 = (ImageView) findViewById(R.id.imageView14); //CH
        img15 = (ImageView) findViewById(R.id.imageView15); //BRZ
        img16 = (ImageView) findViewById(R.id.imageView16); //BRZ

        tr_txv = (TextView) findViewById(R.id.try_txv);


        new_btn = (Button) findViewById(R.id.new_btn);

        new_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img1.setImageResource(R.drawable.df);
                img2.setImageResource(R.drawable.df);
                img3.setImageResource(R.drawable.df);
                img4.setImageResource(R.drawable.df);
                img5.setImageResource(R.drawable.df);
                img6.setImageResource(R.drawable.df);
                img7.setImageResource(R.drawable.df);
                img8.setImageResource(R.drawable.df);
                img9.setImageResource(R.drawable.df);
                img10.setImageResource(R.drawable.df);
                img11.setImageResource(R.drawable.df);
                img12.setImageResource(R.drawable.df);
                img13.setImageResource(R.drawable.df);
                img14.setImageResource(R.drawable.df);
                img15.setImageResource(R.drawable.df);
                img16.setImageResource(R.drawable.df);

                flag1 = false;
                flag2 = false;
                flag3 = false;
                flag4 = false;
                flag5 = false;
                flag6 = false;
                flag7 = false;
                flag8 = false;
                flag9 = false;
                flag10 = false;
                flag11 = false;
                flag12 = false;
                flag13 = false;
                flag14 = false;
                flag15 = false;
                flag16 = false;

                tr_txv.setText("Geuses");

                tr = 0;
            }
        });

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag1 == false && flag4 == false) {
                    img1.setImageResource(R.drawable.egy);
                    flag1 = true;
                } else if (flag1 == false && flag4 == true) {
                    img1.setImageResource(R.drawable.egy);
                    flag1 = true;
                } else if (flag1 == true && flag4 == false) {
                    img1.setImageResource(R.drawable.df);
                    flag1 = false;
                } else if (flag1 == true && flag4 == true) {
                    Toast.makeText(MainActivity.this, "Already solved", Toast.LENGTH_SHORT).show();
                }
                tr++;
                tr_txv.setText("Geuses = " + tr / 4);
            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag4 == false && flag1 == false) {
                    img4.setImageResource(R.drawable.egy);
                    flag4 = true;
                } else if (flag4 == false && flag1 == true) {
                    img4.setImageResource(R.drawable.egy);
                    flag4 = true;
                } else if (flag4 == true && flag1 == false) {
                    img4.setImageResource(R.drawable.df);
                    flag4 = false;
                } else if (flag4 == true && flag1 == true) {
                    Toast.makeText(MainActivity.this, "Already solved", Toast.LENGTH_SHORT).show();
                }
                tr++;
                tr_txv.setText("Geuses = " + tr / 4);
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag2 == false && flag12 == false) {
                    img2.setImageResource(R.drawable.fr);
                    flag2 = true;
                } else if (flag2 == false && flag12 == true) {
                    img2.setImageResource(R.drawable.fr);
                    flag2 = true;
                } else if (flag2 == true && flag12 == false) {
                    img2.setImageResource(R.drawable.df);
                    flag2 = false;
                } else if (flag2 == true && flag12 == true) {
                    Toast.makeText(MainActivity.this, "Already solved", Toast.LENGTH_SHORT).show();
                }
                tr++;
                tr_txv.setText("Geuses = " + tr / 4);
            }
        });

        img12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag12 == false && flag2 == false) {
                    img12.setImageResource(R.drawable.fr);
                    flag12 = true;
                } else if (flag12 == false && flag2 == true) {
                    img12.setImageResource(R.drawable.fr);
                    flag12 = true;
                } else if (flag12 == true && flag2 == false) {
                    img12.setImageResource(R.drawable.df);
                    flag12 = false;
                } else if (flag12 == true && flag2 == true) {
                    Toast.makeText(MainActivity.this, "Already solved", Toast.LENGTH_SHORT).show();
                }
                tr++;
                tr_txv.setText("Geuses = " + tr / 4);
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag3 == false && flag5 == false) {
                    img3.setImageResource(R.drawable.us);
                    flag3 = true;
                } else if (flag3 == false && flag5 == true) {
                    img3.setImageResource(R.drawable.us);
                    flag3 = true;
                } else if (flag3 == true && flag5 == false) {
                    img3.setImageResource(R.drawable.df);
                    flag3 = false;
                } else if (flag3 == true && flag5 == true) {
                    Toast.makeText(MainActivity.this, "Already solved", Toast.LENGTH_SHORT).show();
                }
                tr++;
                tr_txv.setText("Geuses = " + tr / 4);
            }
        });

        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag5 == false && flag3 == false) {
                    img5.setImageResource(R.drawable.us);
                    flag5 = true;
                } else if (flag5 == false && flag3 == true) {
                    img5.setImageResource(R.drawable.us);
                    flag5 = true;
                } else if (flag5 == true && flag3 == false) {
                    img5.setImageResource(R.drawable.df);
                    flag5 = false;
                } else if (flag5 == true && flag3 == true) {
                    Toast.makeText(MainActivity.this, "Already solved", Toast.LENGTH_SHORT).show();
                }
                tr++;
                tr_txv.setText("Geuses = " + tr / 4);
            }
        });

        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag6 == false && flag7 == false) {
                    img6.setImageResource(R.drawable.alg);
                    flag6 = true;
                } else if (flag6 == false && flag7 == true) {
                    img6.setImageResource(R.drawable.alg);
                    flag6 = true;
                } else if (flag6 == true && flag7 == false) {
                    img6.setImageResource(R.drawable.df);
                    flag6 = false;
                } else if (flag6 == true && flag7 == true) {
                    Toast.makeText(MainActivity.this, "Already solved", Toast.LENGTH_SHORT).show();
                }
                tr++;
                tr_txv.setText("Geuses = " + tr / 4);
            }
        });

        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag7 == false && flag6 == false) {
                    img7.setImageResource(R.drawable.alg);
                    flag7 = true;
                } else if (flag7 == false && flag6 == true) {
                    img7.setImageResource(R.drawable.alg);
                    flag7 = true;
                } else if (flag7 == true && flag6 == false) {
                    img7.setImageResource(R.drawable.df);
                    flag7 = false;
                } else if (flag7 == true && flag6 == true) {
                    Toast.makeText(MainActivity.this, "Already solved", Toast.LENGTH_SHORT).show();
                }
                tr++;
                tr_txv.setText("Geuses = " + tr / 4);
            }
        });

        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag8 == false && flag11 == false) {
                    img8.setImageResource(R.drawable.ger);
                    flag8 = true;
                } else if (flag8 == false && flag11 == true) {
                    img8.setImageResource(R.drawable.ger);
                    flag8 = true;
                } else if (flag8 == true && flag11 == false) {
                    img8.setImageResource(R.drawable.df);
                    flag8 = false;
                } else if (flag8 == true && flag11 == true) {
                    Toast.makeText(MainActivity.this, "Already solved", Toast.LENGTH_SHORT).show();
                }
                tr++;
                tr_txv.setText("Geuses = " + tr / 4);
            }
        });

        img11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag11 == false && flag8 == false) {
                    img11.setImageResource(R.drawable.ger);
                    flag11 = true;
                } else if (flag11 == false && flag8 == true) {
                    img11.setImageResource(R.drawable.ger);
                    flag11 = true;
                } else if (flag11 == true && flag8 == false) {
                    img11.setImageResource(R.drawable.df);
                    flag11 = false;
                } else if (flag11 == true && flag8 == true) {
                    Toast.makeText(MainActivity.this, "Already solved", Toast.LENGTH_SHORT).show();
                }
                tr++;
                tr_txv.setText("Geuses = " + tr / 4);
            }
        });

        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag9 == false && flag13 == false) {
                    img9.setImageResource(R.drawable.itl);
                    flag9 = true;
                } else if (flag9 == false && flag13 == true) {
                    img9.setImageResource(R.drawable.itl);
                    flag9 = true;
                } else if (flag9 == true && flag13 == false) {
                    img9.setImageResource(R.drawable.df);
                    flag9 = false;
                } else if (flag9 == true && flag13 == true) {
                    Toast.makeText(MainActivity.this, "Already solved", Toast.LENGTH_SHORT).show();
                }
                tr++;
                tr_txv.setText("Geuses = " + tr / 4);
            }
        });

        img13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag13 == false && flag9 == false) {
                    img13.setImageResource(R.drawable.itl);
                    flag13 = true;
                } else if (flag13 == false && flag9 == true) {
                    img13.setImageResource(R.drawable.itl);
                    flag13 = true;
                } else if (flag13 == true && flag9 == false) {
                    img13.setImageResource(R.drawable.df);
                    flag13 = false;
                } else if (flag13 == true && flag9 == true) {
                    Toast.makeText(MainActivity.this, "Already solved", Toast.LENGTH_SHORT).show();
                }
                tr++;
                tr_txv.setText("Geuses = " + tr / 4);
            }
        });

        img10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag10 == false && flag14 == false) {
                    img10.setImageResource(R.drawable.ch);
                    flag10 = true;
                } else if (flag10 == false && flag14 == true) {
                    img10.setImageResource(R.drawable.ch);
                    flag10 = true;
                } else if (flag10 == true && flag14 == false) {
                    img10.setImageResource(R.drawable.df);
                    flag10 = false;
                } else if (flag10 == true && flag14 == true) {
                    Toast.makeText(MainActivity.this, "Already solved", Toast.LENGTH_SHORT).show();
                }
                tr++;
                tr_txv.setText("Geuses = " + tr / 4);
            }
        });

        img14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag14 == false && flag10 == false) {
                    img14.setImageResource(R.drawable.ch);
                    flag14 = true;
                } else if (flag14 == false && flag10 == true) {
                    img14.setImageResource(R.drawable.ch);
                    flag14 = true;
                } else if (flag14 == true && flag10 == false) {
                    img14.setImageResource(R.drawable.df);
                    flag14 = false;
                } else if (flag14 == true && flag10 == true) {
                    Toast.makeText(MainActivity.this, "Already solved", Toast.LENGTH_SHORT).show();
                }
                tr++;
                tr_txv.setText("Geuses = " + tr / 4);
            }
        });

        img15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag15 == false && flag16 == false) {
                    img15.setImageResource(R.drawable.brz);
                    flag15 = true;
                } else if (flag15 == false && flag16 == true) {
                    img15.setImageResource(R.drawable.brz);
                    flag15 = true;
                } else if (flag15 == true && flag16 == false) {
                    img15.setImageResource(R.drawable.df);
                    flag15 = false;
                } else if (flag15 == true && flag16 == true) {
                    Toast.makeText(MainActivity.this, "Already solved", Toast.LENGTH_SHORT).show();
                }
                tr++;
                tr_txv.setText("Geuses = " + tr / 4);
            }
        });

        img16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag16 == false && flag15 == false) {
                    img16.setImageResource(R.drawable.brz);
                    flag16 = true;
                } else if (flag16 == false && flag15 == true) {
                    img16.setImageResource(R.drawable.brz);
                    flag16 = true;
                } else if (flag16 == true && flag15 == false) {
                    img16.setImageResource(R.drawable.df);
                    flag16 = false;
                } else if (flag16 == true && flag15 == true) {
                    Toast.makeText(MainActivity.this, "Already solved", Toast.LENGTH_SHORT).show();
                }
                tr++;
                tr_txv.setText("Geuses = " + tr / 4);
            }
        });

    }
}
