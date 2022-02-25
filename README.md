# DesignPatternsEmJava
Implementação dos Design Patterns em Java

Factory / Fábrica

O padrão de fábrica é um dos padrões de design mais usado em Java. Este tipo de padrão de design se enquadra no padrão criacional, pois fornece uma maneira de criar um objeto;
No padrão Factory criamos objetos sem expor a lógica de criação ao cliente e nos referimos ao objeto recém-criado usando uma interface comum.

No exemplo dado no código. Temos um programinha simples que define qual a medida do dispositivo escolhido pelo usuário. Primeiro é criada então uma interface que vai ter como 
anotação, um método chamado Define Medidas, esse método deverá ser implementado por todas as classes relacionadas (Televisao, celular, notebook e Tablet). Depois é criado então uma
fábrica de métodos, por isso o nome do padrão. Nesta fábrica, ao inves de lidarmos diretamente com as classes, invocamos o método através da interface criada. Isso garante que a lógica
da implementação seja conhecida apenas o suficiente, garantindo segurança no código. 

No método main, ao invés de chamarmos a classe através do operador new, instanciamos a classe MedidasFactory e atravez dela todas as operações são criadas. 



Singleton

é um dos padrões de design mais simples em Java. Ele se enquadra no padrão criacional.

Esse padrão envolve uma única classe responsável por criar um objeto, assegurando que apenas um único objeto seja criado. Esse classe fornece uma maneira de acessar seu único objeto que pode ser acessado diretamente sem a necessidade de instanciar o objeto da classe.

