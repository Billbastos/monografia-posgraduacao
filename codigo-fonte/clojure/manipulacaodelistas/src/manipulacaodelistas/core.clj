(ns manipulacaodelistas.core
  (:gen-class))

(defn -main
  [args]

  (def tempoInicial (double (. System (nanoTime))))

  (def numeros (range 1 1000001))
  (def resultado (filter #(= 0 (rem % 2)) numeros))

  (def tempoFinal (double (. System (nanoTime))))

  (println (format "Resultado: %d" (.size resultado)))
  (println (format "Tempo (ms): %.6f" (/ (- tempoFinal tempoInicial) 1000000))))
