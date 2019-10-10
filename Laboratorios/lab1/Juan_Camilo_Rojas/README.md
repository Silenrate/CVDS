# Hoja de vida
## Datos personales
* **Nombre:** *Juan Camilo Rojas Ortiz*
* **Edad:** 19 años
* **Ciudad:** Bogotá
* **Universidad:** *Escuela Colombiana de Ingeniería*
* **Carrera:** Ingeniería de Sistemas
* **Semestre:** 7
## Plan de estudios
el plan de estudios se puede encontrar en  [plan de estudios sistemas](https://www.escuelaing.edu.co/escuela/planesEstudio/img/sistemas/Malla-curricular-SISTEMAS.pdf) 
Las materias que estoy cursando este semestre son:  
1.CVDS  
2.RECO  
3.AUPN  
4.FCFI\
## Imagen Random:
![](https://i.ytimg.com/vi/-M_j9rMGejI/maxresdefault.jpg)

## Algoritmo de Dijkstra
El algoritmo de Dijkstra, también llamado algoritmo de caminos mínimos, es un algoritmo para la determinación del camino más corto, dado un vértice origen, hacia el resto de los vértices en un grafo que tiene pesos en cada arista. Su nombre alude a Edsger Dijkstra, científico de la computación de los Países Bajos que lo describió por primera vez en 1959.

La idea subyacente en este algoritmo consiste en ir explorando todos los caminos más cortos que parten del vértice origen y que llevan a todos los demás vértices; cuando se obtiene el camino más corto desde el vértice origen hasta el resto de los vértices que componen el grafo, el algoritmo se detiene.
~~~
 DIJKSTRA (Grafo G, nodo_fuente s)       
       para u ? V[G] hacer
           distancia[u] = INFINITO
           padre[u] = NULL
           visto[u] = false
       distancia[s] = 0
       adicionar (cola, (s, distancia[s]))
       mientras que cola no es vacía hacer
           u = extraer_mínimo(cola)
           visto[u] = true
           para todos v ? adyacencia[u] hacer
               si ¬ visto[u]      
                   si distancia[v] > distancia[u] + peso (u, v) hacer
                       distancia[v] = distancia[u] + peso (u, v)
                       padre[v] = u
                       adicionar(cola,(v, distancia[v]))
~~~
se puede encontrar mas infromacion de este algoritmo en <https://es.wikipedia.org/wiki/Algoritmo_de_Dijkstra>