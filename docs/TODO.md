
# 模组内容

## 物品

### 食物

```groovy
loom {
  runs {
    datagen {
      client()

      name "Data Generation"
      vmArg "-Dfabric-api.datagen"
      vmArg "-Dfabric-api.datagen.output-dir=${file("src/generated/resources")}"
      vmArg "-Dfabric-api.datagen.modid=<你的模组id>"
      vmArg "-Dporting_lib.datagen.existing_resources=${file("src/main/resources")}"
    }
  }
}
```

- 灰油菊：
    - [ ] 阿塞拉斯茶 - 治头痛
    - [ ] 伊奥温炖肉 - 走马灯
    - [ ] 肉派
        - 普通肉派
        - 人肉派 - 斜体区分 不同阵营吃效果不同
    - [ ] 鹿肉餐
    - [ ] 野猪肉餐 - 类似下界乐事中烤猪
    - [ ] 芝士玉米
    - [ ] 蜘蛛炖
    - [ ] 蝎子炖
- 一如：
    - [ ] 兰巴斯火锅
    - [ ] 蛆面包锅
    - [ ] 烤全野牛
    - [ ] 薯根套餐
    - [ ] 兰巴斯烧卖
    - [ ] 山药派
    - [ ] 香蕉派
    - [ ] 浆果橄榄派
    - [ ] 奥克饮料拌魔古尔花
    - [ ] 瑁珑坚果沙拉
    - [ ] 大盘切座狼
    - [ ] 麦香骆驼
    - [ ] 恩特饮料糖
- 暮语：
    - [ ] 人肉干
    - [ ] 人肉涮肉
    - [ ] 食人妖鼻涕泡泡泡糖
    - [ ] 山药炖狮子
    - [ ] 阿塞拉斯牛瘪菜
    - [ ] 座狼手抓饭
    - [ ] 杂梅糖
    - [ ] 魔古尔人肉蘑菇派
    - [ ] 胯骨轴子
- 徐小小：
    - [ ] 烤蜘蛛大餐
    - [ ] 炖妖兽汤
- 09：
    - [ ] 哈拉德蝎子炖
    - [ ] 白蚁粥
    - [ ] 海盗鱼豆腐
- 北龙：
    - [ ] 烤驼峰
- 雅琴：
    - [ ] 白蚁拌沙拉
    - [ ] 爆炸柠檬糖

### 刀

## 方块

### 炉灶
### 厨柜