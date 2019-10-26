#Git projelerinde kimin hangi komiti yaptığını belirteleme için user.name ve user.email belirlenmelidir..

git config --global user.name "kullanıcı adınız"

git config --global user.email "email adresiniz"

git config --global user.name

git config --global user.email 

# git init bulunulan dizinin bir git projesi haline gelmesi sağlar
git init

#Git staging area ekler bu ara bir katmandır ' "." "bu dizinde bulunu tüm dosyaları demek nokta yerine uzantısıyla dosya ismi de verilebilir'
git add .

# git repostory eklemeyi sağlar
git commit -m "mesaj"

# Çıkılan versiyonları listeler
git log

#bulunulan branch ve dizinin durumunu söyler
git status

#dizinde yapılan değişiklikleri listeler, 
#parametresiz çalıştırılırsa git deposu ile dizin farkını gösterir, 
#"git diff --staged" parametre verirsek git deposu ile geçiş bölgesi (staged area) daki farklılıkları gösterir
git diff

# silme 
git rm dosyaadı.dosyayolu
git rm -r dizinadı/dosyaadı.dosyayolu
git rm -r dizinadı/

#taşıma, dizin ve dosya değişikliği
git mv dosyaadı.dosyayolu dizinadı/
git mv dosyaadı.dosyayolu dosyaadı.dosyayolu 

#değişiklikleri geri alma
#çaşma dizininde yaptığınız değişiklikleri
git checkout -- dosyaadı
#staged area yaptığınız değişiklikleri
git reset HEAD dosyaadı #sonrasında çalıma dizinide yapılan şeklide devam edilir

#versiyon değiştirme versiyondaki tüm dizin ve dosyaları geri getitir
git checkout versiyonnumarası -- . #ardından commit gerekir

#git repostory eklenmesi sağlar githubRepo takma addır başka isimlerde verebilir
git remote add githubRepo repostory_url_eklenir

#push yapmak -u bütün dosyalar demek githubRepo takma adı master hangi branch ise o yazılır
git push -u githubRepo master

#gitin takip etmesini istemediğiniz dosyaları eklemeyebilme
cat >> .gitignore
dosyaadı
dizinadı/*
!dizinadı/dosyaadı.dosyauzantısı
^C

#projelerin çekilmesi
git pull

#branchleri sılar all parametresi verildiğinde uzak pc deki  branchleride sırlar
git branch --all

#local branch oluşturma
git branch branchadı

#branch değiştirme
git checkout branchadı

