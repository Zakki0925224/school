# 演習1の分析
d = read.table(pipe("xclip -selection clipboard -o", open="r"), header = TRUE)

summary(d)
# summaryの見方
# Min. = 最小値
# 1st Qu. = 第1四分位(25%)
# Median = 中央値(第2四分位(50%))
# Mean = 平均値
# 3rd Qu. = 第3四分位(75%)
# Max. = 最大値

#     支店１          支店２           支店３          支店４
# Min.   : 0.50   Min.   : 1.200   Min.   : 1.40   Min.   : 0.600
# 1st Qu.: 4.55   1st Qu.: 4.125   1st Qu.: 4.05   1st Qu.: 4.425
# Median : 8.15   Median : 8.700   Median : 8.85   Median : 7.800
# Mean   :11.61   Mean   :13.250   Mean   : 8.73   Mean   : 8.505
# 3rd Qu.:11.12   3rd Qu.:14.875   3rd Qu.:12.82   3rd Qu.:11.500
# Max.   :79.00   Max.   :92.000   Max.   :19.20   Max.   :18.300
#     支店５
# Min.   :-2.100
# 1st Qu.: 2.000
# Median : 5.800
# Mean   : 7.020
# 3rd Qu.: 9.225
# Max.   :34.400

# 2標本t検定対応なしを使って、それぞれの関係を見る
t.test(d$支店１, d$支店２, var.equal = FALSE)
#         Welch Two Sample t-test
#
# data:  d$支店１ and d$支店２
# t = -0.28593, df = 37.104, p-value = 0.7765
# alternative hypothesis: true difference in means is not equal to 0
# 95 percent confidence interval:
#  -13.260377   9.980377
# sample estimates:
# mean of x mean of y
#     11.61     13.25

t.test(d$支店１, d$支店３, var.equal = FALSE)
#         Welch Two Sample t-test
#
# data:  d$支店１ and d$支店３
# t = 0.7355, df = 22.896, p-value = 0.4695
# alternative hypothesis: true difference in means is not equal to 0
# 95 percent confidence interval:
#  -5.222307 10.982307
# sample estimates:
# mean of x mean of y
#     11.61      8.73

t.test(d$支店１, d$支店４, var.equal = FALSE)
#        Welch Two Sample t-test
#
# data:  d$支店１ and d$支店４
# t = 0.79092, df = 23.106, p-value = 0.437
# alternative hypothesis: true difference in means is not equal to 0
# 95 percent confidence interval:
#  -5.014132 11.224132
# sample estimates:
# mean of x mean of y
#    11.610     8.505

t.test(d$支店１, d$支店５, var.equal = FALSE)
#         Welch Two Sample t-test
#
# data:  d$支店１ and d$支店５
# t = 1.1119, df = 27.191, p-value = 0.2759
# alternative hypothesis: true difference in means is not equal to 0
# 95 percent confidence interval:
#  -3.877472 13.057472
# sample estimates:
# mean of x mean of y
#     11.61      7.02

t.test(d$支店２, d$支店３, var.equal = FALSE)
#         Welch Two Sample t-test
#
# data:  d$支店２ and d$支店３
# t = 0.99966, df = 21.863, p-value = 0.3284
# alternative hypothesis: true difference in means is not equal to 0
# 95 percent confidence interval:
#  -4.860499 13.900499
# sample estimates:
# mean of x mean of y
#     13.25      8.73

t.test(d$支店２, d$支店４, var.equal = FALSE)
#         Welch Two Sample t-test
#
# data:  d$支店２ and d$支店４
# t = 1.0474, df = 22.018, p-value = 0.3063
# alternative hypothesis: true difference in means is not equal to 0
# 95 percent confidence interval:
#  -4.649794 14.139794
# sample estimates:
# mean of x mean of y
#    13.250     8.505

t.test(d$支店２, d$支店５, var.equal = FALSE)
#         Welch Two Sample t-test
#
# data:  d$支店２ and d$支店５
# t = 1.3236, df = 25.128, p-value = 0.1975
# alternative hypothesis: true difference in means is not equal to 0
# 95 percent confidence interval:
#  -3.461131 15.921131
# sample estimates:
# mean of x mean of y
#     13.25      7.02

t.test(d$支店３, d$支店４, var.equal = FALSE)
#         Welch Two Sample t-test
#
# data:  d$支店３ and d$支店４
# t = 0.1308, df = 37.973, p-value = 0.8966
# alternative hypothesis: true difference in means is not equal to 0
# 95 percent confidence interval:
#  -3.25738  3.70738
# sample estimates:
# mean of x mean of y
#     8.730     8.505

t.test(d$支店３, d$支店５, var.equal = FALSE)
#        Welch Two Sample t-test
#
# data:  d$支店３ and d$支店５
# t = 0.79829, df = 33.372, p-value = 0.4303
# alternative hypothesis: true difference in means is not equal to 0
# 95 percent confidence interval:
#  -2.646227  6.066227
# sample estimates:
# mean of x mean of y
#      8.73      7.02

t.test(d$支店４, d$支店５, var.equal = FALSE)
#         Welch Two Sample t-test
#
# data:  d$支店４ and d$支店５
# t = 0.68734, df = 33.872, p-value = 0.4965
# alternative hypothesis: true difference in means is not equal to 0
# 95 percent confidence interval:
#  -2.906266  5.876266
# sample estimates:
# mean of x mean of y
#     8.505     7.020
