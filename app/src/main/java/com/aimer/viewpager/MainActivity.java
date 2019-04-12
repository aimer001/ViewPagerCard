package com.aimer.viewpager;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.aimer.viewpager.adapter.ViewPagerCardAdapter;
import com.aimer.viewpager.bean.InfoBean;

import java.util.ArrayList;
import java.util.List;

/*
 *
 * */
public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private List<InfoBean> mList;
    private ViewPagerCardAdapter mAdapter;
    private InfoBean mInfoBean;
    private String name[] = {"卫宫切嗣", "Kiritsugu", "卫宫士郎", "Emiya", "远坂凛"};
    private String desc[] = {"卫宫切嗣，日本轻小说《Fate/Zero》及其衍生作品中的主要角色。 [1]  第四次圣杯战争中Saber的Master（御主），卫宫士郎的养父，被称为“魔术师杀手”的男人。虽然是希望世界和平的梦想家，但实践时却是冷酷无情的现实主义者。有着极为沉痛的过去和悲伤的回忆。",
            "Kiritsugu Emiya (Japanese: 衛宮 切嗣 Hepburn: Emiya Kiritsugu) is a fictional character first introduced in the Fate/stay Night visual novel by Type-Moon and further explored later in the light novel prequel Fate/Zero by Gen Urobuchi. Kiritsugu is introduced as the recently deceased adoptive father of a teenager named Shirou Emiya whom he met at a fire.",
            "卫宫[Emiya]，TYPE-MOON的游戏作品及相关动画《Fate》系列中的人物，第五次圣杯战争时由远坂凛召唤出的从者，职阶是Archer。作为英灵的基本能力偏低，主要靠Servant中出现的众多投影产物和自身的战斗经验来弥补差距。精于近身格斗战及弓术，亦擅长对魔术战和家务，本体为未来的卫宫士郎成为守护者后的姿态。",
            "Shirou Emiya (Japanese: 衛宮 士郎 Hepburn: Emiya Shirō) is a character and the main protagonist of the 2004 visual novel Fate/stay night, published by Type-Moon. Shirou is a teenager who accidentally participates in the \"Holy Grail War\" alongside six other mages looking for the eponymous treasure, an all-powerful, wish-granting relic.",
            "远坂凛，日本文字冒险游戏《Fate/stay night》及其衍生作品中的角色之一。魔道之名门·远坂家的现任当主，是第四次圣杯战争参与者远坂时臣的女儿，父亲在战争后期被其弟子言峰绮礼杀害，随后言峰绮礼监护凛。 [1]  参加第五次圣杯战争，并命运般地将卫宫士郎的未来“卫宫”召唤为Archer。"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewPager = findViewById(R.id.viewpager);
        mList = new ArrayList<>();
        for (int i = 0; i < name.length; i++) {
            mInfoBean = new InfoBean();
            mInfoBean.setName(name[i]);
            mInfoBean.setInfo(desc[i]);
            mList.add(mInfoBean);
        }

        mAdapter = new ViewPagerCardAdapter(mList, this);

        mViewPager.setAdapter(mAdapter);

        mViewPager.setOffscreenPageLimit(6);

    }
}
