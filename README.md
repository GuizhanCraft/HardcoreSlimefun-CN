# :skull_and_crossbones: 硬核粘液科技 - Hardcore Slimefun

该附属插件旨在尽可能增加粘液科技的难度。  
不知道你为什么想安装这个插件，你得对玩家好一点。

还是决定安装么?好吧，你应该看看以下的内容:
* [如何配置服务器](#wrench-设置)

## 下载

**自动更新**: 汉化版构建#4及以上版本包含自动更新功能，默认开启。

点击这里下载 HardcoreSlimefun: [下载 HardcoreSlimefun](https://builds.guizhanss.net/ybw0014/HardcoreSlimefun-CN/main)

<p align="center">
  <a href="https://github.com/ybw0014/HardcoreSlimefun-CN/actions/workflows/maven.yml">
    <img src="https://github.com/ybw0014/HardcoreSlimefun-CN/actions/workflows/maven.yml/badge.svg" alt="Java CI"/>
  </a>
  <a href="https://builds.guizhanss.net/ybw0014/HardcoreSlimefun-CN/main">
    <img src="https://builds.guizhanss.net/f/ybw0014/HardcoreSlimefun-CN/main/badge.svg" alt="Build status"/>
  </a>
</p>

# :wrench: 设置

当你安装本插件后，你需要设置本插件。  
打开`/plugins/HardcoreSlimefun/config.yml`，你可以进行以下配置:

```yaml
# 开启自动更新
auto-update: true
on-death:
  # 设置为true时，玩家将在死亡时丢失一个随机研究
  reset-random-research: true
  # 玩家死亡时重置所有研究的概率(百分比)
  # 有效值: 0-100，设置为100总是会重置研究，0则不会重置研究
  chance-to-reset-all-researches: 5

on-research:
  # 研究失败的概率(百分比)
  # 有效值: 0-100，设置为100总是会失败，0则不会失败
  chance-of-failure: 10

android:
  # 机器故障的概率(百分比)
  # 有效值: 0-100，设置为100总是会故障，0则不会故障
  chance-to-malfunction: 10
  # 机器故障持续时间(秒)
  malfunction-duration: 30

# 提示消息
messages:
  # 可使用 %research% 来展示丢失研究的名字
  lost-random-research: '&c你丢失了一个已解锁的研究!'
  lost-all-research: '&c哦不!你丢失了所有的研究!'
  research-failed: '&c研究失败! 你需要再试一次 :^)'
  android-malfunctioned: '&c你的机器人出了点故障! 它将在一段时间后恢复工作.'
```