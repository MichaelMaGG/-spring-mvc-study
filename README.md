mvn archetype:generate -DgroupId=imooc-arthur -DartifactId=spring-mvc-study -DarchetypeArtifactId=maven-archetype-webapp

echo # -spring-mvc-study >> README.md
git init
git add README.md
git commit -m "first commit"
git remote add origin https://github.com/MichaelMaGG/-spring-mvc-study.git
git push -u origin master